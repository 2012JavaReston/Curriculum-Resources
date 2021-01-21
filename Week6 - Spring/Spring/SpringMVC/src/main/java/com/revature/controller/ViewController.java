package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	/*
	 * Might be used with server side rendering. 
	 */
	
	@GetMapping(value = "/forwardingToStuff")
	public String nextPage() {
		
//		return "greetings/hello"; // ---> http://localhost:8080/SpringMVC/mvc/greetings/hello
//		return "/mvc/greetings/hello"; // ---> http://localhost:8080/SpringMVC/mvc/greetings/hello
//		return "/greetings/hello"; // --> http://localhost:8080/SpringMVC/greetings/hello
//		return "/mainPage.html"; //When targetting views (html), prepend with "/" and the full folder path in webapp
								// ---> http://localhost:8080/SpringMVC/mainPage.html
		
		
//		return "/super/special/views/otherPage.html";
//		return "otherPage"; //This only works with the viewResolver existing in the xml file. 
		return "mainPage";
		
		
	}
	
	@GetMapping(value = "/redirectingToStuff")
	public String outsidePage() {
		
//		return "redirect: https://www.google.com";
//		return "redirect: http://localhost:8080/SpringMVC/mainPage.html";
		return "redirect: /SpringMVC/mainPage.html";
	}

}
