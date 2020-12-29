package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CookieServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookieList = request.getCookies();
		
		for(Cookie c: cookieList) {
			System.out.println(c.getValue());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		/*
		 * authentication checking that 
		 * 		username exists
		 * 		password exists
		 * 		username and password are both matching
		 */
		
		Cookie c = new Cookie("username",username);
		Cookie anotherC = new Cookie("password",password);
		
		c.setMaxAge(5);
		anotherC.setMaxAge(5);
		
		response.addCookie(c);
		response.addCookie(anotherC);
		
	}

}
