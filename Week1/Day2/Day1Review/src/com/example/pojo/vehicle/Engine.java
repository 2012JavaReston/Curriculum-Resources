package com.example.pojo.vehicle;

public class Engine {
	
	/*
	 * The Object class:
	 * 		Every class in Java is a child class of the Object class  (i.e. it's the root class)
	 * 		Object class comes with some methods built in. 
	 * 			Some regarding threads: notiff(), notifyall(), wait()..
	 * 			.toString(), will will print our object as a string
	 * 			.toClass will return the class and package. 
	 * 			.hashCode() will return a hashed representation of the object. 
	 * 
	 * Tangent: 
	 * 		Hashing vs encryption:
	 * 			Encryption is 2 way, when you encrypt value you expect to decrypt the value. 
	 * 			Hashing is 1 way
	 */
	
	private double horsepower;
	private double torque;
	private int pistons;
	private int cylinders;

	//JVM provides with a no args constructore IF AND ONLY IF no other constructor exists. 
	
	//all args constructor 
	public Engine(double horsepower, double torque, int pistons, int cylinders) {
//		super();
		this.horsepower = horsepower;
		this.torque = torque;
		this.pistons = pistons;
		this.cylinders = cylinders;
		System.out.println("All arguments");
	}
	
	public Engine(double horsepower) {
//		this.horsepower = horsepower;
		this(horsepower,100,55,50); 
		System.out.println("Inside a single args constructor ");
		
	}
	
	//no args constructor
	public Engine() {
		
		this(100); //constructor chaining! 
		
		
		System.out.println("Inside no args!");
//		this.horsepower = 100;
//		this.torque = 100;
//		this.pistons = 4;
//		this.cylinders = 4;
		
	}
	
	
	//Overloading is an example of polymorphism 
	// It allows to create methods with the same name, that miplement different logic. 
	// We've changed the arguments that are passed in. 
	// 			Changed the number of arguments 
	//			Changed the type of the arguments 
	//			Changes the order of the arguments. 
	
	public void start() {
		System.out.println("Engine does not start!");
		Object obj = new Object();
		obj.equals(new Engine());
		
	}
	
//	public boolean start() {
//		return 1;
//	}
	
	public int start(double fuel) {
		System.out.println("Engine kinda starts");
		return 0;
	}
	
	public int start(boolean fuel) {
		System.out.println("Engine starts");
		return 0;
	}
	
	public void start(double fuel, boolean nitros) {
		System.out.println("First the fuel then the nitros!");
	}
	
	public void start(boolean nitros, double fuel) {
		System.out.println("First the nitros then the fuel!");
	}
	

}
