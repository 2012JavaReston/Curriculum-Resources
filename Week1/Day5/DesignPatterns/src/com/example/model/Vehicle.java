package com.example.model;

public interface Vehicle {
	
	/*
	 * What happens when you have a very popular interface, that's being implemented and extended by other classes and interfaces!
	 
	 * When we want to add additional functionality to our interface, our classes all break!
	 * Even if it's one small quality of life method
	 */
	
	public default void drive() {
		//Java offers us "default" a keyword to allow us to implement a method without breaking our child classes!
		// This breaks the "full" abstraction aspect of interfaces. Now we're allowed to have concrete methods. 
	}
	
	

}
