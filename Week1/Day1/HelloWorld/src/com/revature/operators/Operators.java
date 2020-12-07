package com.revature.operators;


/*
 * What are packages? 
 * 		They are like folders 
 * 
 * Why do we packages? 
 * 		1) Provides controlled access (offers anotehr level of encapsulation )
 * 		2) Prevents naming conflicts. 
 * 		3) Seraching/locating classess, interfaces. 
 */

public class Operators {
	
	public static void main(String[] args) {
		
		//operators in Java.
		// Arithmitic Operators
		
		/*	(x,y)
		 *  Addition  +
		 * 	Substractiuon -
		 * 	Multiplication *
		 * 	Division /
		 * 	Modulus %, returns the remainder of a division between x and y  
		 * 	
		 * 	(x)
		 * 	increment  ++: will increase the value of x by 1
		 * 	decrement  --: will decrease the value of x by 1
		 * 
		 */
		
		//Assignment Operators
		/* (x,y)
		 * = : Assigns a variable to be equal to the value on the right hand sid.
		 * += : Addis in addition to the original value 
		 * -= : Deducts from the original value and reassins
		 * *= : multiples the original value and reassigns 
		 * /= :divides the original value 
		 * %= : returns the remainders of original value   
		 */
		
		//Comparison Operators
		/* (x,y)
		 * == : equal to 
		 * !=: not equal to 
		 * > : Greater than 
		 * < : less than 
		 * <=: Less than or equal to 
		 * >=: Greater than or equl to 
		 */
		
		int myInt = 1;
		
//		System.out.println(++myInt); //When we add ++ to the right hand side, it will evaluate the "outside" expression first, then increment
//		System.out.println(++myInt);
		
//		if(myInt++ == 3) {
//			System.out.println("condition met!");
//			System.out.println(myInt);
//		}
		
		// Java Logical Operators 
		/*	OR only one premise has to be met: ||
		 *  AND both premises have to be true : &&
		 *  NOT : flips the expression value: !
		 */
		
//		if(!(myInt >= 5) && myInt%2 == 0) { //my number has to be greater than or equal to 4 and even
//			System.out.println("myInt is greater than 4 and even");
//		}
//		
//		if(myInt >= 5 || myInt%2 == 0) {
//			System.out.println("Only one condition met!");
//		}
//		
//		if( !(++myInt >= 5)) {
//			//code block executes when myInt is less than 5 
//			System.out.println("myInt is less than 5");
//		}
//		
//		System.out.println(myInt);
		
		
		
		
		boolean bool = (myInt--) >= 5;
		System.out.println(myInt+=20);
		System.out.println(bool);
		
		
		
		
		
	}

}
