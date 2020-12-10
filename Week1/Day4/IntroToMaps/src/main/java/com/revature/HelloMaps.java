package com.revature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HelloMaps {
	
	/*
	 * MAP is not a part of COLLECTION hierarchy
	 * 
	 * What is a map?
	 * 		Is an object that maps 'keys' to 'values' (also known as a dictionary in other languages). 
	 * 		Each key has to be unique and can be mapped to only one object, note that you can map different keys 
	 * 		to duplicate values. 
	 * 
	 * Methods for basic operations: 
	 * 		put, get, remove, containsKey, containsValue, size and empty
	 * 
	 * Bulk Operations:
	 * 		putAll, clear 
	 * 
	 * Collection views:
	 * 		keySet, values and entrySet
	 * 
	 * Different Child classes that can implement Map:
	 * 			HashMap:
	 * 				Allows duplicate values, not duplicate keys
	 * 				Allows a single null key and mulitple null values 
	 * 				Does NOT guarantee order 
	 * 
	 * 			TreeMap:
	 * 				Does not allow null keys, does allow null values 
	 * 				Sorting according to the natural ordering of the keys 
	 * 
	 * 			LinkedHashMap:
	 * 				Maintains insertion order, pretty similar to a HashMap
	 * 
	 */
	
	public static void main(String[] maps) {
		
		//declaring
		Map<String, String> myStringMap; //Map is an interface, so we need a child class to cimplement it for us!
		
		//intializing and assgning.
		myStringMap = new HashMap<>();
		
		myStringMap.put("Health Fruit", "Apple");
		myStringMap.put("Unhealthy Snack", "Cake");
		
//		System.out.println(myStringMap);
		
//		System.out.println(myStringMap.get("Health Fruit")); //We pass in a key to get a value 
//		System.out.println(myStringMap.get("Unhealthy Snack"));
//		
		// Declaring, assigning and initalizing. 
		Map<Object, List<Integer>> objIntMap = new HashMap<>();
		
		
		Object a = new Object();
		List<Integer> aList = new ArrayList<>();
		aList.add(0);
		
		
		Object b = new Object();
		List<Integer> bList = new ArrayList<>();
		bList.add(2);
		bList.add(22);
		
		Object c = new Object();
		
		
		List<Integer> cList = new ArrayList<>();
		
//		Object d = null;
		
		
		objIntMap.put(a, aList);
		objIntMap.put(b, bList);
		objIntMap.put(c, aList);
		objIntMap.put(null, aList);
//		objIntMap.put(new Object(), bList); //We're not assigning any reference variable, so we can't refence this object again
		objIntMap.put(b, aList); //When we insert with the same key again, it'll override the value.
		
		
//		System.out.println(objIntMap);
//		System.out.println(objIntMap.get(a));
//		System.out.println(objIntMap.get(c));
//		System.out.println(objIntMap.get(null));
//		System.out.println(objIntMap.get(new Object())); //If doesn't exist, we get null. 
		
		
		Map<Object, List<Integer>> objIntMap2 = new HashMap<>();
		objIntMap2.put(new Object(), cList);
		objIntMap2.putAll(objIntMap);
//		System.out.println(objIntMap2);
		
		
//		for(List<Integer> i: objIntMap2.values()) { //iterating over the value set
//			System.out.println(i);
//		}
//		
//		for(Object i : objIntMap2.keySet()) {
//			System.out.println(i);
//		}
//		
//		for(String i : myStringMap.values()) {
//			System.out.println(i);
//		}
		
//		System.out.println(objIntMap2.entrySet());
		
		for(Entry<Object, List<Integer>> i:  objIntMap2.entrySet()) {
//			System.out.println(i);
		}
		
		//Collection specific 
		// Iterator: is an object that can be used to loop through collections (also can loop through lists). 
		// We can also use iterator to loop through it, the iterator come from iterator();
		
		Set<String> stringSetFromMap = myStringMap.keySet();
		
		Iterator<String> it = stringSetFromMap.iterator();
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
	}

}
