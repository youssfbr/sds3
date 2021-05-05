package com.github.youssfbr.vendas.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.youssfbr.vendas.dto.SaleDTO;
import com.github.youssfbr.vendas.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
	
	private SaleService service;
	
	public SaleController(SaleService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		return ResponseEntity.ok(service.findAll(pageable));
	}
}
