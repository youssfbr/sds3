package com.github.youssfbr.vendas.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.youssfbr.vendas.dto.SellerDTO;
import com.github.youssfbr.vendas.services.SellerService;

@RestController
@RequestMapping("/sellers")
public class SellerController {
	
	private SellerService service;
	
	public SellerController(SellerService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
}
