package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodByeController {
	
	public static void generateGoodbye(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		/*
		 * Lots and lots of service layer, dao layer logic
		 */
		resp.getWriter().write("Goodbye, and thanks for the fish!");
		
	}

}
