package com.github.youssfbr.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.youssfbr.vendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
