package com.example.scanner;

import java.util.Scanner;

public class ScannerDriver {
	
	public static void main(String[] args) {
		
		/*
		 * What is the Scanner?
		 * 		It's a final class that allows input from the user, from the console.
		 * 
		 * Scanner packages comes from one of the core libraries, 
		 * 		java.util
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Welcome User, please give us an input!");
//		
//		String input = sc.nextLine(); //for a single word 
//		
//		System.out.println("Hi again, give me another input!");
//		
//		String input2 = sc.nextLine();
//		
//		System.out.println("you're input was " + input2);
//		
//		System.out.println("Goodbye user, you're input was " + input);
		
		int inputInt = sc.nextInt();
		
		if(inputInt == 1) {
			System.out.println("Welcome user!");
		}else if(inputInt == 1000000) {
			System.out.println("Welcome secret user");
		}else {
			System.out.println("Invalid input!");
		}
		
		
		
		
		
		
	}

}
