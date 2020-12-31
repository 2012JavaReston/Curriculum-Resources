package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.service.PlanetFun;

public class LoginController {
	
	/*
	 * What is the purpose of our login method? 
	 * 
	 * 	1)To authenticate the user. 
	 * 	2)Define a session, so the user doesn't have to keep passing their valuable information
	 * 	3)Navigate the user to the appropriate page, depending on whether their credentials are correct or not. 
	 */


	public static void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		//1)a)First we check that their using the right method, we don't want them to use a GET request to send the private information. 
		if(req.getMethod().equals("POST")) {
			
			//1)b)For this method, we're grabbing information from a form, information can also be sent via an AJAX request. 
			if(req.getParameter("username").equals(PlanetFun.masterUser.getUsername())) {
				
				
					//if username matches the masterUsere we will define a session 
					/*
					 * In your case you should be using a more complex authentication method. 
					 * Still check the username and password but against a database. 
					 * Where should our authentication method exist? Controller? Service? DAO? 
					 * 
					 */
				
					
					//2)Set a session with attributes, so now all our controller's can first check if the user is allowed access. 
					// By setting a session, we don't need to validate information against the database every time they send a request. 
					HttpSession sesh = req.getSession();
					sesh.setAttribute("MasterAccess", true);
					
					//we will redirect to the homecontroller if they hav access!. 
					//Our home controller will give them acess to the home page if they have access. 
					//But what if they don't have access? Check the home controller to see what it does. 
					resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
			}else {
				
				//invalid credentials
				resp.setStatus(403);
				resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
			}
			
		}else {
			
			//invalide method
			resp.setStatus(405);
			resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
		}
		
	}

	public static void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//Our logout method invalidates the session and redirects back to the home controller
		req.getSession().invalidate();
		resp.sendRedirect("http://localhost:8080/PlanetAPI/api/landing");
	}
	
	public static void getLandingPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//The home controller will navigate back us to our login controller, our login controller will return the login page. 
		// This can be after a false login, or if they're entering the website for the very first time. 
		RequestDispatcher redis = req.getRequestDispatcher("/login.html");
		
		redis.forward(req, resp);
		
	}

}
