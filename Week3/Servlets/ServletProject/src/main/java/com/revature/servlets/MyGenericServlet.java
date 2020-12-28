package com.revature.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet extends GenericServlet{
	
	/*
	 * A generic servlet is more configurable than a HTTPServlet
	 * 
	 * It's designed to handle any protocol, possible HTTP, FTP,SMTL 
	 * 
	 * 
	 * Why don't we use GenericServlet? 
	 * 		HttpServlet, the service method is already implemted and will route our requests
	 * 		to the appropriate verb methods. 
	 */

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//We don't use GenericServlet, because we would have to implement our service method ourselves. 
		//And I for one, don't know how to do that.
		
	}

}
