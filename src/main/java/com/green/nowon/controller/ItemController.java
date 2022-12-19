package com.green.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.domain.dto.ItemInsertDTO;
import com.green.nowon.service.ItemService;


@Controller
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@GetMapping("/admin/goods") //상품등록
	public String item() {
		return "admin/goods";
	}
	
	@PostMapping("/admin/goods") //상품등록
	public String item(ItemInsertDTO dto) {
		service.save(dto);
		return "admin/goods";
	}
	
}
