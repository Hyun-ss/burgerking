package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {

	@GetMapping("/signin")
		public String Signin() {
		return "/sign/signin";
	}
	
	@GetMapping("/signup")
	public String Signup() {
	return "/sign/signup";
}
	
}
