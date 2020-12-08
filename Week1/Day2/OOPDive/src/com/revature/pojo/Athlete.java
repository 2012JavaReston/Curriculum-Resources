package com.revature.pojo;

//IS-A relationship
public class Athlete extends Human{
	
	
	/*
	 * 
	 * In homogenous inheritance:
	 * 			Class -> Class (extends)
	 * 			Abstract class -> class (extends)
	 * 			Class -> Abstract Class (extends)
	 * 			interface -> interface (extends)
	 * 
	 * In hetrogenous inheritance 
	 * 			Interface -> class (implements)
	 */
	
	
	
	/*
	 * Inheritance:
	 * 		Allows you to adopt/inherit the method and variables. 
	 * 		(Allows us to reuse code)
	 * Animal -> Human -> Athlete
	 * A-> B -> C 
	 * 		C will have access to all the method and variables in B and A (assuming appropriate access modifiers)
	 * 		B will have access to all of As method but not C
	 * 		A will not have access to any of Bs or Cs methods or variables. 
	 * 	
	 */
	
	//Overriding is modifing methods that we inherit from a parent class 
	// Return type and the method signature has to be the same
	
	@Override //Provides metadata to the JVM to tell us that this method is being inherited 
	public void jumpAHurdle() {
		super.jumpAHurdle();
		System.out.println("Not just a human, a super athlete!");
		
	}
	
	@Override
	public void run() {
		super.run();
	}
	
	public void superJump() {
		System.out.println("I'm jumping eve higher!");
	}
	
	

}
