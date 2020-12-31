package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controller.RequestHelper;

/*
 * Servlet implementation class MasterServlet
 * 
 * We chuck in a "/api/" into our endpoint, why?
 * 		Because otherwise we won't be able to access our other resources, like HTML. 
 * 		e.g. our html file exists in "http://localhost:8080/PlanetAPI/index.html"
 * 		but if we define our servlet to handle all our requests i.e. "/*", then the request will keep getting looped back to the master servlet. 
 * 
 * Beyond defining out base endpoint, the servlet should not have anything else defined other than all the http methods we will be handling. 
 */
@WebServlet("/api/*")
public class MasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MasterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside master servlet!");
		RequestHelper.process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
