package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	private static String baseUrl = "http://ec2-3-138-246-106.us-east-2.compute.amazonaws.com:8085/";
	
	
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
		
		/*
		 * Our request helper actually DEFINES our endpoints. 
		 * 
		 * The master servlet will handle the process of receiving and sending the request and response object. 
		 * 
		 * If we want to define functionality at a endpoint, we define it inside the requesthelper, otherwise we won't route it to anywhere useful.
		 * 
		 * Our CONTROLLERS will actuall provide the funtionality at each endpoint (i.e. the methods)
		 * 	We group our methods into Controllers that hold methods that are related to each other. 
		 * 	e.g. 
		 * 		Planet controller will handle all methods regarding the processing of Planet objects (creating, removing, updating planets)
		 * 		Login controller will handle authenticating the user and defining a session for the user. (as well as the login.html page)
		 * 		Home controller will handle the "home.html" page. 
		 * 
		 */
		
		switch(endpoint) {
		
		
			case "/PlanetAPI/api/Planet":
				//Following appropriate standards, we should have our endpoints define the resource we're trying to interact with. 
				// But if we have multiple methods for a single endpoint, how do we distinguish between the requests? 
				// We check what the associated METHOD is with each request. 
				switch(req.getMethod()) {
					case "POST":
						PlanetController.postPlanet(req, resp);
						break;
					case "GET":
						PlanetController.getPlanet(req, resp);
						break;
					case "DELETE":
						System.out.println("This should be eazy to implement by now");
						break;
					case "PUT":
						System.out.println("I can't do everything for you.");
						break;
				}
				break;
			case "/PlanetAPI/api/home":
				HomeController.getHomePage(req, resp);
				break;
			case "/PlanetAPI/api/landing":
				LoginController.getLandingPage(req,resp);
				break;
			case "/PlanetAPI/api/login":
				LoginController.login(req,resp);
				break;
			case "/PlanetAPI/api/logout":
				LoginController.logout(req, resp);
				break;
			case "/PlanetAPI/api/ajax.js":
				/*
				Right, this is a weird as heck fix that has only occured this time round for me
				Currently, our html file looks for our Javascript and CSS script by sending a HTTP (GET) request. 
				This hasn't happened before, but what this case does is hijack that request 
				and give it the actual resource. 
				*/
				resp.sendRedirect(baseUrl + "PlanetAPI/ajax.js");
				break;
			default:
				HomeController.resetToHome(req, resp);
				//Put an error page here as well
				
		}
	}

}
