package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	
	private static String baseUrl = "http://ec2-3-138-246-106.us-east-2.compute.amazonaws.com:8085/";
	
	//What does our Home controller do? 
	// It's sole responsibility is to handle when to give us our home page. 
	// There is only way to get the home page:
//			A sessions exists AND the session contains an attribute MasterAccess that equals true
//			EXTRA: && will only execute the right hand operator if the left hand operator is true (so we don't need to worry about null errors)

	
	public static void getHomePage(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		// checking that session exists and session attributes match (access - true)
		if(req.getSession(false) != null && (Boolean)req.getSession().getAttribute("MasterAccess")) {
			RequestDispatcher redis = req.getRequestDispatcher("/index.html");
			System.out.println("Logging in !");
			redis.forward(req, resp);
//			resp.sendRedirect("http://localhost:8080/PlanetAPI/index.html");
		}else {
//			resp.sendRedirect("http://localhost:8080/PlanetAPI/api/landing");
			resp.sendRedirect(baseUrl + "PlanetAPI/api/landing" );
		}
//		resp.setStatus(403);
		
		
	}

	//This will return our page to the login page. 
	//We use this method inside of our switch block (default) to handle any weird url or mistypes. 
	public static void resetToHome(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		
		//we're routing all the invalid requests to the landing page.
		RequestDispatcher redis = req.getRequestDispatcher("/api/landing");
		
		redis.forward(req, resp);
	}
}
