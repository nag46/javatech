package com.javatech.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/findEnv")
class FindEnvironmentController {
	
	@Value("${spring.environment}")
	private String message;
	
	@GetMapping
	public String hello() {
		return message;
	}
}
