package com.example.strings;

public class WorkingWithStrings {
	
	/*
	 * Stack vs Heap
	 * 	Memory in Java can be either sotred in the stack or the heap 
	 * 
	 * 	Speed? 
	 * 		Stack is much faster than the Heap, allowing for quicker retrievals
	 * 
	 * 	Size? 
	 * 		Heap has more capacity
	 * 
	 *	What is stored in both?
	 *		Stack: contains (primitive) variables and reference variables to objects
	 *		Heap: contains objects (and pretty much everything else)
	 *
	 *	Use cases 
	 *		Stack is used by a thread, memory is only acceesible to the thread using it. 
	 * 			Stack memory is cleared once the thread is finished using it. 
	 * 		Heap is globally accessible to the system (all threads) and the memory 
	 * 			is not cleared until the appication is closed. 
	 */
	
	public static void main(String[] args) {
		
		/*
		 * pass by value vs pass by reference:
		 * 
		 * PBV: creates a copy when we assing it. 
		 * PVR: points to the exact same instance of the object. 
		 */
		
		
		/*
		 * This is a build up to String
		 * 
		 * String is an object that contains an array of characters. It allows you to create 
		 * 	and manipulate strings. 
		 * 
		 * The String class is immutable and class is final. 
		 * 		immutable: the string can't be changed. 
		 * final: The class cannot be extended 
		 * 
		 * String Literals are stored in the String pool (which is also within the heap)
		 * 
		 * When a new String @Object@ is created, it check to see if the String pool already 
		 * 	has the String literal valus. If yes it point to the value, if not, then it 
		 * 	crates a new instance of the string literal in the pool 
		 */
		
		String s1 = "Hello!"; //When we put a text inside double quotes, they are string literals!
		String s2 = "Hello Again!";
		
		String s3 = new String("Hello!"); //Forcing Java to create a new instance
		String s4 = "Hello!";
		
//		System.out.println(s3);
		
//		s3 = "Hi"; // both s1 and s3 should be modified!
		
		System.out.println(s1 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3)); //String class overrides .equals() to check contents instead of memory 
		
//		System.out.println(s3);
//		System.out.println(s1);
		
		s2.charAt(2); //Gives us chataer at position 2
		s2.length(); // gives us length 
		s2.substring(3,4);
		s2.indexOf("abc"); //What happens if doesn't exist?
		s2.split("e");
		
		s2 = s2.toLowerCase();
		
		System.out.println(s2);
		
	
		
		
	}

}
