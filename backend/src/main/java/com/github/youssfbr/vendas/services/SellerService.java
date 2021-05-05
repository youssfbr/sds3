package com.github.youssfbr.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.youssfbr.vendas.dto.SellerDTO;
import com.github.youssfbr.vendas.entities.Seller;
import com.github.youssfbr.vendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	private SellerRepository repository;
	
	public SellerService(SellerRepository repository) {
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll() {
		List<Seller> list = repository.findAll();
		
		return list.stream().map(sel -> new SellerDTO(sel)).collect(Collectors.toList());
	}

}
