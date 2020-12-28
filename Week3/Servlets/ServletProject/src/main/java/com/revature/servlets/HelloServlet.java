package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	/*
	 * Servlet is a Java class that allows us to handle requests and responses to the server.
	 * It extends the capability of the server by allowing us to execute Java code with regards 
	 * 	to requests and response. 
	 * 
	 * Servlet Container (Web Container) Handles the servlet's lifecycle (Tomcat Apache)
	 * 
	 * We need to servlet libraries to our project. 
	 * Easy way: 
	 * 		Levaraging Maven. 
	 * Less easy way:
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("Inside our get method of our HelloServlet!");
		
	}

}
