package com.example.arrays;

public class ArrayExamples {
	
	//What is an array? 
	/*
	 * fixed ordered set of same datatype data, in allocation of memory.  
	 * 
	 * Is a list of items that are iterable and the size of the array is imutable (unchangeable)
	 * Each element in the array have to be of the the same datatype. 
	 * Postions are indexed. 
	 */
	
	
	
	public void arrayGenerator() {
		
//		int[] myIntArray; //Declaring an Array but we didn't initalise it. 
		 
		//When using curly braces we have to declare and initalise it in the same line. 
		int[] myIntArray = {1,2,3,4,5};
		
		int[] myOtherIntArray; //we've created an array of 5 elements, but with default values of 0.
		
		myOtherIntArray = new int[5]; //We can initalise it on another line. 
		
		char[] myCharArray = new char[3]; // We've created a char array with 3 elements, with default values of a single space
		
		myCharArray[0] = 'a';
		
		myCharArray[0] = 'c';
		
//		myCharArray = new char[7];
		
//		System.out.println(myOtherIntArray);
		
		int j = 0;
		while(j < myIntArray.length) {
//			System.out.println(myIntArray[j]);
			if(myIntArray[j] == 4) {
				continue;
			}
			j++;
//			break; // only iterates once
		}
		
		for(int i = 0; i < myIntArray.length;i++) {
			
			 
			if(myIntArray[i] == 4) {
				continue;
			}
			System.out.println(myIntArray[i]);
		}
		
		for(int i = myIntArray.length - 1; i >= 0;i--) {
//			System.out.println(myIntArray[i]);
			break;
		}
		
		for(int i = myCharArray.length - 1; i >= 0;i--) { //don't need to change the datatype of i, because it's to do with the position. 
//			System.out.println(myCharArray[i]);
		}
		
//		For-each loop or Enhanced for loop 
		for(int i: myIntArray) {
//			System.out.println(i); //This time we're actually referencing the element itself
		}
		
		for(char i: myCharArray) {
//			System.out.println(i);
			break; //only iterates once
		}
		
	}
	
	public static void main(String[] kiwis) { //When the JVM enters 
		
		ArrayExamples aEx = new ArrayExamples();
		
		/*
		 * break: 
		 * 		terminates the loop
		 * 
		 * continue:
		 * 		Terminates the current loop, but will carry on the loop if the loop condition is still met.
		 */
		
		
		aEx.arrayGenerator();
		
		boolean bool = true;
		
		if(bool) {
			//we can't use break inside of a if or else if block 
		} else {
			
		}
		
	}

}
