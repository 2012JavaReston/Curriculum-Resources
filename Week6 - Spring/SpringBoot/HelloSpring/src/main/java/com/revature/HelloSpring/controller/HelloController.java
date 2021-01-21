package com.revature.HelloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("helloController")
public class HelloController {
	
	@GetMapping("/ello")
	public @ResponseBody String hello() {
		return "ello!";
	}
}
