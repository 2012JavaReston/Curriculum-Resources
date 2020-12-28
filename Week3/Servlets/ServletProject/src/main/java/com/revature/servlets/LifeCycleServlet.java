package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

	@Override 
	public void init() throws ServletException {
		//This is invoked by the servlet container
		// This creates the servlet inside of our server.
		// This is only invoked once!
		
		super.init();
		System.out.println("Being initalised!");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//The service method for our servlet
		// invoked whenever a request is pinged at the server. 
		// invoked multiple times duirng it's lifecycle!
		super.service(req, resp);
		System.out.println("Inside service method!");
	}
	
	@Override
	public void destroy() {
		// Invoked once during it's lifecycle, at then end. 
		super.destroy();
		System.out.println("I'm destroyed!");
	}
	
	
	
}
