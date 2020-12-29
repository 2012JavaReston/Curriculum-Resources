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
		
		switch(endpoint) {
			case "/PlanetAPI/api/getPlanet":
				PlanetController.getPlanet(req, resp);
				break;
			case "/PlanetAPI/api/createPlanet":
				PlanetController.postPlanet(req, resp);
				break;
		}
		
	}

}
