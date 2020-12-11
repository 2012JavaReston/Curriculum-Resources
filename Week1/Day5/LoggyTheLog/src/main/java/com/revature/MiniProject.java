package com.revature;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MiniProject {
	
	final static Logger loggy = Logger.getLogger(MiniProject.class);
	
	/*
	 * With Log4J we have different logging levels!
	 * 
	 * lowest priority -> highest priority
	 * 
	 * All < debug < info < warn < error < fatal < off
	 */
	
	
	public static void main(String[] args) {
		
		loggy.setLevel(Level.INFO);
	
		
		
		loggy.info("This is an info block!");
		
		
		//--------Example project with an example interaction)-------------
		/*
		 * User logs into account/interface
		 */
		boolean success = true;
		
		loggy.setLevel(Level.DEBUG);
		
		loggy.debug("We're debugging now!");
		
		if(success) {
			loggy.info("The customer has succesfully logged in!");
		} else {
			loggy.warn("Customer unable to log in!");
		}
		
		try {
			
			int i = 0/0;
			
		}catch(Exception e){
			loggy.error("There is an errror going on", new IndexOutOfBoundsException());
		}
		
		
		/*
		 * USer might request food 
		 */
		
		/*
		 * employee logs in, completes the order 
		 * 
		 * filewrite.write("employee completes orders at new Time().humanTime())
		 */
		
		/*
		 * Kitchen creates the food
		 */
		
		/*
		 * employee returns the food to user!
		 */
		//------------------------------------------------------------------------
		
		/*
		 * Logging
		 * 		Recording events that occur while the application is exuciting. As users execute programs on the client side, we can log the entires
		 * 		and behaviour to the support team. This allows developers to access information about an app executing without being there or getting
		 * 		"indirect" information from the user. 
		 * 
		 * 
		 * 		We could manually create a stream object and write an interaction to a file every time. 
		 * 
		 * 
		 */
		
		
	}

}
