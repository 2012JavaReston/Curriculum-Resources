package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("HelloController")
@RequestMapping(value = "/greetings")
@CrossOrigin(origins = "*") //CORS Issues 
public class HelloController {
	
	@RequestMapping(value = "/hello") //http://localhost:8080/SpringMVC/mvc/greetings/hello
	public @ResponseBody String sayHello() {
		return "ello there!";
	}

}
