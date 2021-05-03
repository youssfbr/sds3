const Footer = () => {
  return (
    <footer className="footer mt-auto py-3 bg-dark">
      <div className="container">
        <p className="text-light">
          App desenvolvido por{" "}
          <a
            href="https://github.com/youssfbr"
            target="_blank"
            rel="noreferrer"
          >
            Alisson Youssf
          </a>
        </p>

        <p className="text-light">
          Linkedin:{" "}
          <a
            href="https://linkedin.com/in/youssf"
            target="_blank"
            rel="noreferrer"
          >
            youssfbr
          </a>
        </p>

        <p className="text-light">
          <small>
            <strong>Semana Spring React</strong>
            <br />
            Evento promovido pela escola DevSuperior:{" "}
            <a
              href="https://instagram.com/devsuperior.ig"
              target="_blank"
              rel="noreferrer"
            >
              @devsuperior.ig
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
};

export default Footer;
