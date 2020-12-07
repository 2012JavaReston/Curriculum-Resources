package com.revature.scopes;

public class MyScope {
	
	static int i = 100;
	
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
		
		add();
		minus();
		
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
