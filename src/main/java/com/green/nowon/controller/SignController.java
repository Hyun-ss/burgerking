package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {

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
