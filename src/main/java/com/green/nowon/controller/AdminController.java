package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	@GetMapping("/admin")
	public String admin() {
		return "/admin/admin";
	}
	
	@GetMapping("/admin/goods")
	public String adminGoods() {
		return "/admin/goods";
	}
	
	@GetMapping("/admin/order")
	public String adminOrder() {
		return "/admin/order";
	}
	@GetMapping("/admin/faq")
	public String adminFaq() {
		return "/admin/faq";
	}
}
