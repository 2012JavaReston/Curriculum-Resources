package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.models.Planet;

public class HelloServlet extends HttpServlet{
	
	private static Planet p1 = new Planet();
	
	public static void create() {
		Planet p = new Planet();
	}
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
	
	/*
	 * Servlet (I); none of the methods are implemented 
	 * 		-> GenericServlet (AC); most of the lifecycle methods are implemented, no HTTP methods exist
	 * 			-> HttpServlet (AC); all the lifecycle methods are implemeted, a lot of HTTP methods exist. 
	 */
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//The service method for our hello servlet 
		super.service(req, resp);
		
		
		
		System.out.println("Inside service method!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Inside our get method of our HelloServlet!");
		
		create();
		//Inside of here is where you're retrival methods work 
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		//inside of here is where you're creation methods work 
		System.out.println("Inside of our post method!");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		create();
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		p1.setId(p1.getId()+1); //not idempotent, but that's cause we've configured incorrectly on the server!
	}

}
