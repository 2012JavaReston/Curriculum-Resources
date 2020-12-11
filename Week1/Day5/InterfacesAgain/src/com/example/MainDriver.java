package com.example;

public class MainDriver {
	
	/*
	 * There are 3 types of Interfaces 
	 * 
	 * Marker Interfaces: Serializable
	 * 		There are no methods to implement. This is used to "mark" the interface in a IS-A relationship
	 * 		In the case of serializable, it tells the JVM that this entity is expected to be serialized (provides metadata)
	 * 
	 * Functional Interfaces: Comparable 
	 * 		Have one and ONLY one method to be implemented. 
	 * 
	 * (Normal) Interfaces:
	 * 		An interface with 2 or more methods to be implemented. 
	 */
	
	public static void main(String[] args) {
		
		//An example of lambda function in action 
		// We've instantiated the Functional interface and implemented it's method while doing so. 
		// (paramater1,parameter2,...) -> { //code block we want to execute}
		
		Functional f = (int x,int y) ->{ System.out.println(x +y);};
		
		f.add(1, 2);
		
	}

}
