package com.revature.classes;

public class BasicClass {
	
	/*
	 * What on earth is a Class? 
	 * 
	 * Essentially a blueprint for the instantiation of an object. Typically if you want to access the methods and 
	 * attributes 'within' a class you'll to instantiate it into an object. (unlesss you use a static method) 
	 * 
	 * What's an object? 
	 * 	
	 * Object is an implementation of a class. 
	 * 
	 * Blueprint for a car: It has seats (attribute)
	 * 						It has a model name (attribute) 
	 * 						It should be able to accelerate (behaviour/method)
	 * 						Check whetehr engine is running or not. (attribute)
	 * 						It should be able to brake (method/behaviour)
	 * 
	 * Jeff's car: 
	 * 				The car has 4 seats. 
	 * 				Honda civic 
	 * 				It can accelerate and brake. 
	 * 
	 * 
	 *---Another example----
	 *
	 *Dog :
	 *		name
	 *		legs 
	 *		tail 
	 *		bark()
	 *		fetch()
	 *
	 *Lulu: 
	 *		name: Lulu
	 *		legs: true
	 *		tail: true 
	 *		bark()
	 *		fetch() 
	 */
	
	
	
	//Let's create some object attributes: 
	//This means that an object will only have 3 attributes 
	public int intNumber = 4;
	public double doubly = 4.0;
	public boolean goodWeather = true;
	
	//A method is a function that is belonging to an object. 
	//<access-modifier> <return-type> <method-name>() {}
	public void bark() {
		
		System.out.println("barking, making dog noises!");
	}
	
	public int fetch() {
		return 0;
	}
	

}
