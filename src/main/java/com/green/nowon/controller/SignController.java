package com.green.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.green.nowon.service.SignService;

@Controller
public class SignController {
	
	@Autowired
	private SignService service;

	@GetMapping("/signin")
		public String signin() {
		return "/sign/signin";
	}
	
	@GetMapping("/signup")
		public String signup() {
		return "/sign/signup";
	}
	@GetMapping("/signup2")
		public String signup2() {
		return "/sign/signup2";
	}
	
}
