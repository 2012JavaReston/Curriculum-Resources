package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Planet;
import com.revature.service.PlanetFun;

public class PlanetController {
	
	/*
	 * The controller will connect the servlet to our Java logic 
	 *  The servlet will handle recevining the request and sedning the response. 
	 *  The request displatcher wioll actually handle the routing of the request
	 */
	
	private static PlanetFun pService = new PlanetFun();
	
	public static void getPlanet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		if(req.getMethod().equals("GET")) {
			Planet p = null;
			
			resp.setContentType("application/json");
			
			int id = Integer.parseInt(req.getParameter("planetId"));
			
			p = pService.findAPlanet(id);
			
			ObjectMapper om = new ObjectMapper();
			resp.getWriter().write(om.writeValueAsString(p)); // This will parse our JAva object into a JSON
		
			
		}else {
			resp.setStatus(405);
			
		}
		
	}

	public static void postPlanet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		
		if(req.getMethod().equals("POST")) {
			ObjectMapper om = new ObjectMapper();
			
			Planet p = om.readValue(req.getReader(), com.revature.models.Planet.class);
			
			pService.createLife(p);
			
			resp.setStatus(201); //Always creates a new resource 
			
		} else {
			resp.setStatus(405);
		}
		
	}
}
