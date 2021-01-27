package com.revature.SpringConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
//	@Value("${message}")
	private String configMessage;
	
	@Value("${spring.application.name}")
	private String name;
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	@GetMapping("/test")
	public String ourConfigExample() {
		return configMessage;
	}
	@GetMapping("/name")
	public String clientName() {
		return name;
	}

}
