package com.revature.scopes;

public class MyScope {
	
	static int i = 100; //class scope 
	
	public static void add() {
		int i = 0;
		
		i = i + 10;
		
		for(int k = 0;k < 10; k = k + 1) {
			i++;
		}
	}
	
	public static void minus() {
		int j;
		i = i - 10;
	}
	
	
	/*
	 * Scopes of a variable 
	 * 
	 * Class scope:
	 * 		Variables can be referenced anywhere within the class 
	 * 
	 * Method Scope:
	 * 		Variables can only be referenced within the method 
	 * 
	 * Loop scope 
	 * 		Variables can only be defined within the method. 
	 * 
	 */
	
	public static void main(String[] apples) {
		System.out.println("Welcome to my apples method");
		
		//Scopes 
		// What is it?
		// Visibility 
		// Okay for something to use, or visibility area. 
		// Accessibility. 
		// Known universe of any known entity. 
		
//		int i = 10;
		
		System.out.println(i);
		
		MyScope.add();
		minus();
		
		for(i = 0; i< 10; i++) {
			
		}
		
		System.out.println(i);
		
//		Class > Method > Loop 
		
//		int i = 100;
//		
//		for(i = 0; i< 2; i++) {
//			//Loop scope 
//			//Variables can obly be referenced within the block 
//			System.out.println(i);
//		}
//		
//		System.out.println(i);
	}

}
