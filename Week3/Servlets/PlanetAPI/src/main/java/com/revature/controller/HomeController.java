package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	
	public static void getHomePage(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		// checking that session exists and session attributes match (access - true)
		if(req.getSession(false) != null) {
			RequestDispatcher redis = req.getRequestDispatcher("/index.html");
			System.out.println("Logging in !");
			redis.forward(req, resp);
//			resp.sendRedirect("http://localhost:8080/PlanetAPI/index.html");
		}else {
			resp.sendRedirect("http://localhost:8080/PlanetAPI/api/landing");
		}
//		resp.setStatus(403);
		
		
	}

	public static void resetToHome(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		
		RequestDispatcher redis = req.getRequestDispatcher("/");
		
		redis.forward(req, resp);
	}
}
