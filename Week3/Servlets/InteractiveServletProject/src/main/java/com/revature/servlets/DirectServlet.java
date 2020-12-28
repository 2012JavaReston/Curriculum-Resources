package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Planet;

@WebServlet("/direct")
public class DirectServlet extends HttpServlet{
	
	/*
	 * The ways we can interact with out clients
	 * 
	 * Redirect 
	 * 
	 * Forwarding 
	 * 
	 * Direct response 
	 * 
	 */
	
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		resp.setContentType("text/html"); //This is redundnatn, by default this is the type 
		
		//Let's grab information from the request
		String planetName = req.getParameter("name");
		
		System.out.println(planetName);
		
		Planet p = new Planet(Integer.parseInt(req.getParameter("id")),req.getParameter("name"));
		
		//PrintWrite object is used to directly respond to the client
		//add it to the response 
		PrintWriter pw = resp.getWriter();
	
		
		pw.write("<h1>We're sending something back now!</h1>");
		pw.write("Here's the planet " + p);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		resp.setContentType("application/json");
		
		ObjectMapper om = new ObjectMapper();
		
		Planet p = om.readValue(req.getReader(), com.revature.models.Planet.class);
		
		p.setId(p.hashCode());
		
		System.out.println("Inside our post method of Direct Servlet!");
		resp.getWriter().write(om.writeValueAsString(p));
		
	}

}
