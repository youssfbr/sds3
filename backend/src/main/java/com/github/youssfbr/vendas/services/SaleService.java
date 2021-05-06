package com.github.youssfbr.vendas.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.youssfbr.vendas.dto.SaleDTO;
import com.github.youssfbr.vendas.dto.SaleSuccessDTO;
import com.github.youssfbr.vendas.dto.SaleSumDTO;
import com.github.youssfbr.vendas.entities.Sale;
import com.github.youssfbr.vendas.repositories.SaleRepository;
import com.github.youssfbr.vendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	private SaleRepository repository;
	
	private SellerRepository sellerRepository;
	
	public SaleService(SaleRepository repository, SellerRepository sellerRepository) {		
		this.repository = repository;
		this.sellerRepository = sellerRepository;
	}
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> list = repository.findAll(pageable);
		
		return list.map(sal -> new SaleDTO(sal));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}

}
