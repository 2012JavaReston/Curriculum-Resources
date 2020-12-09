package com.example.collections;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Garbage;

public class IntroToCollections {
	
	/*
	 * Collection Frameowrk 
	 * 
	 * Why?
	 * 		Array objects within Java are limiting to work with. 
	 * 		Can I create a custom method that to make an immutable array? YES
	 * 		If we all create custom methods, it's difficult to share data strcturures. 
	 * 
	 * 		This is where the Collection Framework comes in: 
	 * 
	 * 		Called a framework (more akin to a library). Provides interfaces and classes
	 * 		that allow developer to more easily manage groups of objects. 
	 * 
	 * 	A 'collection' object is designed to store a group of objects, with more flexibility. 
	 * 
	 * 	Advantages:
	 * 		Reduced effort (provides data structures and algorithims for you)
	 * 		Increased performance 
	 * 		Encourages software reuse (provides a standard interfaces)
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] low) {
		
		int[] arrayInt = new int[10];
		
		int a = 9; //Doesn't have any methods, .equals 
		// That's why we levarage wrapper classes and boxing and unboxing and autoboxing. 
		
		List<Integer> listOfInts = new ArrayList<Integer>();
		listOfInts.add(73);
		listOfInts.add(72);
		listOfInts.add(74);
		listOfInts.add(73);
		listOfInts.add(23);
		listOfInts.add(0, 1000);
		
		List<Integer> listOfInts2 = new ArrayList<Integer>();
		
		listOfInts2.add(73);
		listOfInts2.add(23);
		listOfInts2.add(0, 1000);
		listOfInts2.add(73);
		listOfInts2.add(72);
		listOfInts2.add(74);
		
		listOfInts.addAll(listOfInts2);
		
		List<Garbage> randoList = new ArrayList<>();
		Object obj;
		randoList.add(new Garbage("a"));
		randoList.add(new Garbage("d"));
		randoList.add(new Garbage("d"));
		randoList.add(new Garbage("c"));
		
		for(Garbage g: randoList) {
			System.out.println(g);
		}
		// If a garbage object jave the same name, I want them to be equal!
		// Right now the Object .equals() only checks memory address 
		System.out.println(randoList.contains(new Object()));
		
		
		System.out.println(listOfInts);
//		System.out.println(listOfInts.get(0));
		
		System.out.println(listOfInts2);
		
		/*
		 * List:
		 * 		An ordered collection. 
		 * 		May contain duplicate elements 
		 * 		Access via index (positional access) 
		 * 		For lists to equal, they have to have the same elements in the same poistion.
		 * nice methods:
		 * 		.get()
		 * 		.set()
		 * 		.add()
		 * 		.addAll()
		 * 		.remove()
		 * 		.indexOf()
		 * 		.lastIndexOf()
		 * 		.sublist()
		 * 		.contains()
		 */
		
	}

}
