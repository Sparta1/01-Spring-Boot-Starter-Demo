package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Boot !!! Server time " + LocalDateTime.now();
	}
	
}
