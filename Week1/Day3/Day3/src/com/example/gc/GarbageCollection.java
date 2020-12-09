package com.example.gc;

import com.example.model.Garbage;

public class GarbageCollection {
	
	//creating an object within a method 
	
	public static void myMethod() {
		Object o1 = new Object();
	}
	
	public static void main(String[] apples) {
		
		/*
		 * Garbage collection in Java
		 * 
		 * GC is the reason why we as programmers don't need to worry about memory allocation 
		 * in creating and destroying objects. (OutOfMemoryErrors)
		 * 
		 * GC is a daemon thread, (daemon - always running in the background), 
		 * 	(thread is a isolated sequence of code execution). It's purpose is to 
		 * 	clear the Heap memory to free up space for other objects. 
		 * 
		 * It removes objects that are eligibil for removal. What does it take for it 
		 * 	to be eligible?? All and any references to the object have been removed 
		 * 	(UNREACHABLE OBJECTS). 
		 */
		
		//Ways to remove reference
		//nullify the reference
		
		Object o1 = new Garbage();
		o1 = null;
		
		//reassing the reference 
		Object o2 = new Garbage();
		Object o3 = new Garbage();
		
		while(true) {
			o3 = new Garbage();
		}
		
//		o2 = o3; //the object o2 was pointing to will be eligible 
//		
//		//Creating an object in a method 
//		myMethod();
//		
//		//I can try to manually call the garbae collector 
//		System.gc(); //please remove stuff
	}

}
