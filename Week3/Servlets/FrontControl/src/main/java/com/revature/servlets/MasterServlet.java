package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controller.RequestHelper;

//The sole job of a master servlet is to receive requests and rend of responses 
// It should not handle any other logic

//client (HTML and JS) -> MasterServlet -> Requestdispatcher -> Controller -> Service -> Dao -> database 
public class MasterServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException{
		super.init();
		System.out.println("I now exist!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
		throws ServletException, IOException {
		
		String greetings = getInitParameter("Greetings"); //Servlet config
		
		String db = getServletContext().getInitParameter("databaseURl"); //Servlet context
		
		System.out.println(greetings);
		System.out.println(db);
		
		RequestHelper.process(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException {
			
		doGet(req,resp);
		}
	
	@Override
	protected void doPut(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req,resp);
		}

}
