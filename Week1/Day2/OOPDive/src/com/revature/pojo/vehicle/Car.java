package com.revature.pojo.vehicle;

public interface Car {
	
	public static final int a = 5; //both the same modifiers
	
	int b = 0; //both the same modifiers 
	
	//They're public because they should be shared and implemented. 
	//static: belongs to the datatype Car, not an instance of it. 
	// final keyword
	// What do you reckon the final keyword does for variables?
			//makes it a const. 
			// Cannot change the variable once it's been defined, it's immutable. 
	
	
	/*
	 * Interfaces and Abstract classes are how Abstraction in Java is implemented!
	 * 
	 * Interfaces are full abstraction (before Java8/7) and abstract classes are partial abstraction. 
	 * 
	 * What is Abstrataction? 
	 * 		Hiding it's inner working from the user. 
	 * 		Focus more on the behavior rather than theimplementation 
	 * 		More on what it does as opposed to how.
	 * 
	 * 
	 */
	
	// The contract is stating that we want our Car entity to be able to 
	/*
	 * accelerate()
	 * breake
	 * steer 
	 * refuel 
	 * start 
	 * stop 
	 * 
	 * We don't care how it does it, we are setting a contract on what to expect only. 
	 * 
	 */
	
	
	public void accelerate(); /// In an interface, we basically create a contract. 
	
	public void brake();
	
	public void steer();
	
	public void refuel();
	
	public void start();
	
	public void stop();
							

}
