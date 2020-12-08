package com.example.pojo;

public class Human {
	
	//POJO plain old Java object
	//Analagous to real object, or any data entity we plan on working with. 
	
	
	/*
	 * 4 different access modifiers:
	 * 
	 * 	most restrictive -> least restrictive. 
	 * 
	 * 	private: 
	 * 		only accessible within the class
	 * 	default (implicit):
	 * 		accessible with the same class and other classes within the same package. 
	 * 	protected:
	 * 		accessible with the same class and other classes within the same package. Child classes that inherit from it. 
	 * 	public:
	 * 		Can be accessed anywhere in the project. 
	 */
	
	String name; //default access modifier 
	private double weight;
	protected double height; 
	public long sSN;
	
	/*
	 * Terminology: 
	 * 		Functions: takes in arguments, executes logic, returns a value
	 * 		Methods: is a function, associated with an object. 
	 * 		Procedures: takes in arguments, exectures logic, does not return a value. 
	 */
	
	private void jump() {
		System.out.println(this.name + " jumped!");
		weight = weight -1;
	}
	
	protected void exercise() {
		
		if(this.weight < 100) {
			//do nothing
		}else {
			jump();
		}
		
	}

}
