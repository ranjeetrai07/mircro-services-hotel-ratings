package com.codewithranjeet.userService.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello this is Hello";
	}

}
