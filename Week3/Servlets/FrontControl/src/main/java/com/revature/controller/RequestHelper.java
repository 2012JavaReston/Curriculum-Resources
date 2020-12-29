package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static void process(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		
		String endpoint = req.getRequestURI();
		
		switch(endpoint) {
			case "/FrontControl/hello":
				HelloController.generateGreetings(req, resp);
				break;
			case "/FrontControl/goodbye":
				GoodByeController.generateGoodbye(req, resp);
				break;
				
			default:
				HelloController.navigateToHello(req,resp);
				break;
				
		}
		
	}

}
