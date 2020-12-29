package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController {
	
	public static void generateGreetings(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		/*
		 * Lots and lots of service layer, dao layer logic
		 */
		
		//Method guarding 
		
		if(req.getMethod().equals("GET")) {
			
			resp.getWriter().write("Hello, you're in GET");
			
		}else if(req.getMethod().equals("POST")) {
			
			resp.getWriter().write("Hello you're in POST");
		}else {
			resp.setStatus(405, "We don't like put!");
		}
		
		
	}

	public static void navigateToHello(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {


		RequestDispatcher redis = req.getRequestDispatcher("/hello");
		redis.forward(req, resp);
		
	}

}
