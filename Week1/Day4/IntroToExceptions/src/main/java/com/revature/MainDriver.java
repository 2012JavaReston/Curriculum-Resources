package com.revature;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainDriver {
	
	/*
	 * Exception 
	 * 
	 * What is it? 
	 * 		Disruption of the natural flow of code. 
	 * Why do we want Exception?
	 * 		Because it gives us feedback on what caused the disruption
	 * How do we handle Exceptions? 
	 * 
	 * 		try - catch -finally blocks 
	 * 		try -catch 
	 * 		try -finally 
	 * 		try with resources
	 * 
	 * Another way of handling risky code: 
	 * 
	 * 	Add throws
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Theory:
	 * 		Checked vs unchecked exception
	 * 
	 * 		Checked exceptions force you to handle risky code at compile time! (IO Exception)
	 * 
	 */
	
	
	public static void main(String[] args) throws FileNotFoundException, BusinessExceptions { //The JVM to handle it - it'll just crash the system, so don't do this! 
		
//		try {
//			// project logic and whatever
//		} catch (Exception e) {
//			System.out.println("You did something wronge, turn on the system again");
//		}
//		
//		
//		exceptionGenerator();
		
		orderingFruit();
					
	}

	public static void orderingFruit() throws BusinessExceptions {
		Scanner sc = new Scanner(System.in);
		
		String fruit = sc.nextLine();
		
		if(fruit.equals("Tomato")) {
			throw new BusinessExceptions(); //Force us to handle RuntimeExceptions, which are not checked
		}
	}
	
	public static void exceptionGenerator() throws FileNotFoundException {
		
		System.out.println(rootedException());
		
		ioExceptionGenerator();
		
	}
	
	public static int rootedException() {
		
		while(true) {
		try {
			
			//This is some risky code 
//			int i =0/0; // This will "throw" an exception, in this case an ArithmeticException 
			
			System.out.println("Put in valid code!");
			Scanner sc = new Scanner(System.in);
			
			int i = sc.nextInt(); 
			
			//Exceptions that could occur? 
			// arithmitic one 
			//type mismatch exception 
			
			int k = 10/i; //This is non-checked exception 
			break;
			
//			int[] jArray = new int[2];
//			
//			for(int j = 0; j < 100 ; j++) {
//				System.out.println(jArray[j]);
//			}
			
		} catch(ArithmeticException e){
			//This block of code will only exectue if the try block throws an exception!
			//We're not providing any information either!
			System.out.println("You've put in 0, we can't accept that. But we'll accept anythinglese!");
//			e.printStackTrace();
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handling array out of bounds exception");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("CAtches all exceptions!");
		} catch(Throwable t) {
			
			
			
		} finally {
			// finally executes no matter what 
			// very very secure logic  in here 
			System.out.println("Welcome to final!");
		}
		}
		
		return 0;
		//Catch blocks, the most narrow scope of errors should be first.
		
	}


	public static void ioExceptionGenerator() throws FileNotFoundException { //I'm passing the responsibility on to whatever invokes this method!
		
	
		FileReader fileReader = new FileReader("name");
		
		
	}
}
