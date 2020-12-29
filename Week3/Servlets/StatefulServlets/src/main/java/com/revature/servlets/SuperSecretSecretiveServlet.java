package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.models.User;

/**
 * Servlet implementation class SuperSecretSecretiveServlet
 */
@WebServlet("/SuperSecretSecretiveServlet")
public class SuperSecretSecretiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesh = request.getSession(false);
		
		if(sesh == null) {
			response.getWriter().write("Get a session!");
			
			
		}else{
			
			System.out.println(sesh.getAttribute("user"));
			
			if(sesh.getAttribute("user").equals(new User("Bob","superSecurePassword"))) {
				response.getWriter().write("Welcome! " + sesh.getAttribute("username"));
			}else {
				response.getWriter().write("you got a session, but you aint bobby");
			}
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
