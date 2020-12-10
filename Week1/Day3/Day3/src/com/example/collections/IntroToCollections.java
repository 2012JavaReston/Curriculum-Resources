package com.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

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
		// That's why we levarage WRAPPER classes and BOXING and unBOXING and autoBOXING. 
		
		//Generics :enforce type safety!
		// When we define a Collection entity with <ClassType> that means it will 
		// check that the entity being added to the DataStructure is of the correct type. 
//		List<Integer> listOfInts = new ArrayList<Integer>();
		List<Integer> listOfInts = new LinkedList<>();
		
		ArrayList<ArrayList<ArrayList<ArrayList<Garbage>>>> listOfListOfGarbage  = new ArrayList<>();
		
//		listOfListOfGarbage.add
//		listOfListOfGarbage.get(0).get(0).get(0).get(0).name;
		
		listOfInts.add(73);
		listOfInts.add(72);
		listOfInts.add(74);
		listOfInts.add(73);
		listOfInts.add(23);
		listOfInts.add(0, 1000);
//		listOfInts.add((Integer) new Object());
		
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
//			System.out.println(g);
		}
		// If a garbage object jave the same name, I want them to be equal!
		// Right now the Object .equals() only checks memory address 
//		System.out.println(randoList.contains(new Object()));
		
		
//		System.out.println(listOfInts);
//		System.out.println(listOfInts.get(0));
		
//		System.out.println(listOfInts2);
		
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
		
		
		/*
		 * There are multiple child classes that can instantiate a List object 
		 * 
		 * ArrayList:
		 * 		A resizable array (mutable) compared to the buld in array inside Java. Allows you
		 * 		to add and remove elements. 
		 * LinkedList:
		 * 		Consists of nodes, each node will store a value and a 'pointer' to the next node., 
		 * 		Allows for 'easier' addition and removal for entries (Arrays have to resize the entire
		 * 		structure). However require more memory overhead, each node holds the data + address.
		 * Vector:
		 * 		Deprecated (contains legacy methods), but is synchronised (thread safe) 
		 * 
		 */
		
		
		/*
		 * -------------------------------------Queue---------------------------------
		 * 
		 * Ordered list of objects related to insertion order. 
		 * Follows the FIFO or LILO principles (First in first out, or last in last out).
		 * DOES NOT HAVE POSITIONAL INDEXES
		 * Can have duplicate elements
		 * Methods:
		 * 		poll, remove, peek and element
		 * 
		 * Classes:
		 * 		LinkedList: (loot at list definition)
		 * 		PriorityQueue:
		 * 			Will override the queue behaviour to create natural ordering. 
		 * 			Doens't permit null 
		 * 			Doesn't allow hetrogenous objects. 
		 * 		Stack:
		 * 			extends queue, follows LIFO or FILO 
		 * 			
		 * 		
		 */
		
		Queue<Garbage> garbageQueue = new LinkedList<>();
		
		garbageQueue.add(new Garbage("a"));
		garbageQueue.add(new Garbage("c"));
		garbageQueue.add(new Garbage("e"));
		garbageQueue.add(new Garbage("d"));
		garbageQueue.add(new Garbage("f"));
		
//		System.out.println(garbageQueue.poll()); //removes and returns the element at the head
													// of the queue 
		
		
		System.out.println(garbageQueue.peek()); // does not remove the elements but returns it
		
//		System.out.println(garbageQueue.poll());
//		System.out.println(garbageQueue.poll());
//		System.out.println(garbageQueue.poll());
//		System.out.println(garbageQueue.poll());
//		System.out.println(garbageQueue.poll()); // when no elements exists, returns null.
		
		
		
//		garbageQueue.add
		
//		Integer i = 9;
		int j = 7;
		
//		for(Object i: garbageQueue) {
//			System.out.println(i);
//		}
		
//		System.out.println(garbageQueue);
		
		
		Queue<Integer> intQueue = new PriorityQueue<Integer>();
		
		intQueue.add(10);
		intQueue.add(3);
		intQueue.add(1);
		intQueue.add(12);
		intQueue.add(11);
		intQueue.add(11);
		intQueue.add(15);
		
//		System.out.println(intQueue); //When you print out the queue, won't necassairly be in natural order
//		
//		System.out.println(intQueue.poll()); //When you do poll, then it'll return in value order!
//		System.out.println(intQueue.poll());
//		
//		
//		Queue<Integer> arrayListQueue = new PriorityQueue<Integer>(listOfInts);
//		
//		System.out.println(arrayListQueue);
//		System.out.println(arrayListQueue.poll());
//		System.out.println(arrayListQueue.poll());
//		System.out.println(arrayListQueue.poll());
		
		
		
		//-----------------------------------Set-----------------------------------
		
		/*
		 * Set:
		 * 		Does not guarantee insertion order (unordered)
		 * 		No duplicates (each element has to be unique)
		 * 		No index
		 * 		For a set to equal another set, the elements just have to match. 
		 * 		Useful for checking whether all the elements are unique
		 * 
		 * 		HashSet: 	
		 * 			Maintains no order, stores in hash table, best performance
		 * 		LinkedHashSet:
		 * 			Maintains insertion order, linked list running through it, weaker perforamnce
		 *		TreeSet
		 *			Maintains value order, red-black tree, very slow 
		 *			Can't contain null  
		 *			Can't store hetrogenous objects
		 *			TreeSet has a compareTo() method (that utilises an Objects equal to method/comparable method)
		 *
		 */
		
		
//		Set<String> stringSet = new HashSet<>();
//		
//		System.out.println(stringSet.add("Apples"));
//		System.out.println(stringSet.add(new String("Apples")));
//		
//		
//		
//		System.out.println(stringSet);
//		
		
		
		
		Set<Garbage> garbageSet = new HashSet<Garbage>();
		
		Garbage aG = new Garbage("apples");
	
		
		System.out.println(garbageSet.add(new Garbage("kiwis")));
		System.out.println(garbageSet.add(new Garbage("kiwis")));
		System.out.println(garbageSet.add(new Garbage("kiwis")));
//		
//		System.out.println(garbageSet.add(aG));
//		System.out.println(garbageSet.add(aG));
//		System.out.println(garbageSet.add(aG));
		
		System.out.println(new Garbage("kiwis").equals(new Garbage("kiwis")));
		
		
		System.out.println(garbageSet);
		
		Set<Integer> intSet = new HashSet<>(listOfInts);
		
		intSet.add
		System.out.println(listOfInts);
		System.out.println(intSet);
		
	}

}
