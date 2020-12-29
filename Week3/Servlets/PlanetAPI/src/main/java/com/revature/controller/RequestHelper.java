package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	
	public static void process(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		System.out.println(req.getRequestURI());
		
		String endpoint = req.getRequestURI();
		
//		switch(endpoint) {
//			case "/PlanetAPI/api/getPlanet":
//				PlanetController.getPlanet(req, resp);
//				break;
//			case "/PlanetAPI/api/createPlanet":
//				PlanetController.postPlanet(req, resp);
//				break;
//		}
//		
		
		switch(endpoint) {
			case "/PlanetAPI/api/Planet":
				switch(req.getMethod()) {
					case "POST":
						PlanetController.postPlanet(req, resp);
						break;
					case "GET":
						PlanetController.getPlanet(req, resp);
						break;
					case "DELETE":
						break;
					case "PUT":
						break;
				}
				break;
			case "/PlanetAPI/api/":
				HomeController.getHomePage(req, resp);
				break;
//			default:
//				HomeController.resetToHome(req, resp);
//				//Put an error page here as well
				
		}
	}

}
