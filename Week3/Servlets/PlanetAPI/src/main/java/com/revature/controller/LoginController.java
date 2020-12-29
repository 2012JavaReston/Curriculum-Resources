package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.service.PlanetFun;

public class LoginController {


	public static void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		System.out.println(req.getMethod());
		if(req.getMethod().equals("POST")) {
			
			//Grab information via a form 
			if(req.getParameter("username").equals(PlanetFun.masterUser.getUsername())) {
				System.out.println("adding username now!");
				//if username matches the masterUsere we will define a session 
					HttpSession sesh = req.getSession();
					sesh.setAttribute("MasterAccess", true);
					
					//we will redirect to the homecontroller!
					resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
			}else {
				resp.setStatus(403);
				resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
			}
			
		}else {
			resp.setStatus(405);
			resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
		}
		
	}

	public static void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().invalidate();
		resp.sendRedirect("http://localhost:8080/PlanetAPI/api/home");
	}
	
	public static void getLandingPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		RequestDispatcher redis = req.getRequestDispatcher("/login.html");
		
		redis.forward(req, resp);
		
	}

}
