package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/indirect")
public class RedirectingServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		//Navigate the page to another endpoint
//		resp.sendRedirect("http://localhost:8080/InteractiveServletProject/direct?name=Apples&id=200");
		
//		resp.sendRedirect("http://www.google.com");
		
		resp.sendRedirect("http://localhost:8080/InteractiveServletProject/index.html");
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		System.out.println("Inside indirect!");
		RequestDispatcher redir = req.getRequestDispatcher("/direct?name=BlueBerry&id=77");
		
		//We're passing along the same request and response objects!
		redir.forward(req, resp);
		
	}

}
