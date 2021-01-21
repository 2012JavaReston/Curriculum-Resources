package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
	
	/*
	 * Spring can inject other objects into our controllers methods if you need it to. 
	 * e.g. HttpSession, HttpServletRequest, HttpServletREsponse)
	 */
		
	@GetMapping(value = "/login")
	public @ResponseBody String login( HttpServletRequest req, @RequestParam("myName") String myName) {
		
		HttpSession session = req.getSession();
		
		System.out.println("Inside the login method");
		
		session.setAttribute("loggedName", myName);
		session.setAttribute("Access", true);
		
		return "Success";
	}
	
	@GetMapping(value = "/getInfo")
	public @ResponseBody String getInfo(HttpSession session) {
		
		String name = (String) session.getAttribute("loggedName");
		Boolean access = (Boolean) session.getAttribute("Access");
		
		System.out.println(name);
		System.out.println(access);
		
		return "Hola";
	}
	
	@GetMapping(value = "/logout")
	public @ResponseBody String logout(HttpSession session) {
			session.invalidate();
		
		return "Au revior";
	}
}
