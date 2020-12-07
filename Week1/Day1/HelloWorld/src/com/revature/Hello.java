package com.revature;

public class Hello {
	
	/*
	 * What is Java? 
	 * 		Java is a general purpose programming language, following the OOP (Object Oriented programming) paradime. 
	 * 		Mostly used for enterprise software applications. 
	 * 		Strongly -typed language. 
	 * 
	 * 		What are the features? 
	 * 			WORA (Write once Run Anywhere). Java code is turned into bytecode, bytecode is converted into machine code
	 * 			by the JVM. Anything that can run a JVM, can run Java.
	 * 
	 * 			OOP. Reusability. Encapsulation. Polymorphism. Abstraction. 
	 * 
	 * 			Garbage Collection. Don't have to manage our memory allocation. (no need to manage pointers).
	 * 
	 * 			Java is simple to learn and easy to read. Based on C. 
	 * 
	 * 			Java is secure: Due to a lack of manual memory management and no accessing out of bounds arrray. 
	 * 			Means less chances of security flaws occuring, such as stack corruption. 
	 * 
	 * 			Java is open source: Lots of tools and IDEs, many frameworks, ope source libraries. Lots and lots of
	 * 			documentation. 
	 */
	
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
		
		//Primitive data types 
		// Java is not 100% OOP. It contains primitive, which are very basic data types. 
		/*
		 * int  : 4-byte :  32 bits 
		 * boolean : 1 bit: 0 or 1 
		 * char : 2-byte : 16 bits  
		 * float : 4-byte : 32 bits 
		 * long : 8-byte : 64-bits 
		 * double : 8-byte : 64-bits
		 * byte : 1-byte : 8-bits 0 or 1 
		 * short : 2-byte : 16 bits 
		 */
		
		// DataType Variable-Name 
		//Declaration
		int variableName;
		
		//Assignment 
		variableName = 1;
		
		variableName = 2; // In Java variables can be reassigned values.
//		variableName = false// Can't be assigned different datatypes. 
				
		char charVariable = '2';
//		charVariable = 2;
		
//		System.out.println(charVariable);
//		System.out.println(variableName);
		
		
		//Control Flow Statements. 
		
		//Scenario, I want to add something 100 times. 
		
		int myNumber = 0;
		
		myNumber = myNumber + 50;
		myNumber = myNumber + 50;
		myNumber = myNumber + 50;
		myNumber = myNumber + 50;
		myNumber = myNumber + 50;
		
		//Don't do the above way 
		
		
		//We have the for loop)
		//for ( we declare a variable inside the scope of the for loop and give it an inital value ;
		//     this part will specify the end condition (conditional expression);
		//		incrementing expression , i++, otherwise known as adding a one per loop 
		
//		for(int i = 1; i <= 100; i = i + 10) {
//			System.out.println(i);
//		}
		
		
		//We have the while loop	
		// A while loop will loop as long as the conditional expression has been met 
		int i = 1;
		
//		while(i <= 100) {
//			i = i + 10;
//			System.out.println(i);
//			
//		}
		
		
		//do while loop 
		
//		do {
//			/*
//			 * The logic inside do will execute at leaset once, regardless of whether the condition has been met 
//			 */
//			i = i + 10;
//			System.out.println(i);
//		}while(i <= 100);
		
		
		//switch
		// Switch gives you multiple expressions to evaluate. 
		
		char d = 'm';
		
		switch(d) {
			case 't':
			case 'h':
				// d == 't'
				System.out.println("Happy THrusday or Tuesday");
				break;
			case 'w': // d == 'w'
				System.out.println("Happy Wednesday!");
				break;
			case 'm':
				//if a condition is met for a case, this block of code will execute
				System.out.println("Happy Monday!");
//				break;
			default:
				// We don't need a condition for default to execute
				System.out.println("Must be Friday or the weekend!");
		}
		
		// Check whether a number is above 100
		int j = 0;
		
		
		//if else statemets
		if(d == 't') {
			
			//Tuesday  logic 
		}else if(d == 'w') {
			
			//Wednesday logic 
			
		}else if(d == 'm') {
			// Monday logic 
		}else {
			// no condition met logic!
		}
		
		if(j <= 100) {
			
		}
		
		
		
	}

}
