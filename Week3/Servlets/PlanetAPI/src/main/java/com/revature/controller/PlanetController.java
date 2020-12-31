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
	 *  
	 *  The servlet is the door, if it doesn't get handled by the servlet then none of our Java logic executes. 
	 *  
	 *  The request dispatcher will then decide which logic to execute, we can do this by any property of the request object. 
	 *  	But it makes sense to route the requests based on the endpoints and methods. 
	 *  
	 *  The controller is what actually process the request object (i.e. extract data from the request object, execute java logic from 
	 *  	our service layer and modify the response object)
	 */
	
	private static PlanetFun pService = new PlanetFun();
	
	//I've called my read and create methods; getPlanet and postPlanet. I did this to maintain consistency.
	//I could have called them whatever, as long as the requesthelper invokes the right methods in its switch block.
	
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
