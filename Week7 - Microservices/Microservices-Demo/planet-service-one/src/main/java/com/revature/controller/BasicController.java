package com.revature.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //With a Rest Controller, we don't need to add @ResponseBody
public class BasicController {
	
	//I'm creating an attribute, called message inside of my config file, and assigining a value to it. 
	@Value("${message: Here is my special message, all the way from config!}")
	private String message;
	
	@Value("${server.port: 9010}") //The @Value is retrieving a config attribute called "server.port"
	private String serverPort;
	
	@GetMapping("/")
	public String greetings() {
		return "Hola, welcome to my service. We're in port number: " + serverPort; //If we don't have @ResponseBody, it will forward me to localhost:numbers/Hola
						// With a RestController, this is automatically assumed. 
	}
	
	@GetMapping("/message")
	public String message() {
		return message;
	}
	

}
