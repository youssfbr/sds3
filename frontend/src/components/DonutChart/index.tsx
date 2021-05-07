import axios from "axios";
import { BASE_URL } from "pages/requests";
import Chart from "react-apexcharts";
import { SaleSum } from "types/sale";

type ChartData = {
  series: number[];
  labels: string[];
}

const DonutChart = () => {

  let chartData : ChartData = { series: [], labels: []};

  axios.get(`${BASE_URL}/sales/amount-by-seller`)
    .then(response => {
      const data = response.data as SaleSum[];
      const myLabels = data.map(x => x.sellerName);
      const mySeries = data.map(x => x.sum);
      
      chartData = { series: mySeries, labels: myLabels};
      console.log(chartData);
      
    })

  const options = {
    legend: {
      show: true,
    },
  };

  return (
    <Chart
      options={{ ...options, labels: chartData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
};

export default DonutChart;
