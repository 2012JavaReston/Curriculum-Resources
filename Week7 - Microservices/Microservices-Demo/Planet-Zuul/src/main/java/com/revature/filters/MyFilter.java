package com.revature.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


public class MyFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		/*
		 * This method returns a boolean value dependeing on whether a filter should be implemented. 
		 * 
		 * Advanced logic here to decide....
		 */
		
		boolean shouldIFilter = true; // I'm always filtering!
		return shouldIFilter;
	}

	@Override
	public Object run() throws ZuulException {
		
		/*
		 * This is the actual filter logic. 
		 */
		
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest myRequest = context.getRequest();
		
		System.out.println("The method of the request: " + myRequest.getMethod());
		System.out.println("Also, here's the URI: " + myRequest.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		/*
		 * Zuul will parse the string to figure out what type of filter the class should represent. 
		 * 
		 * pre: executes BEFORE the request is routed to the proper service. 
		 * route:
		 * post:
		 * error:
		 */
		return "pre";
	}

	@Override
	public int filterOrder() {
		/*
		 * If you have MANY filters of the same type, then you can set a prcedence order to them. 
		 * 
		 * Numeric order will be the order of the filter triggers. 
		 */
		return 0;
	}

}
