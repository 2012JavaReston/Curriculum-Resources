package com.example.model;

public class Garbage {
	
	public String name;
	
	
	
	public Garbage() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Garbage(String name) {
		super();
		this.name = name;
	}



	@Override
	public void finalize() {
		/*
		 * Is a method (from the Object class) that is called just before an 
		 * 	object is reclaimed for destruction. Allows you to execute some code 
		 * 	just before the object is destroyed. 
		 */
		System.out.println("Help me!");
	}
	
	@Override 
	public boolean equals(Object o) {
		
		if(!(this.name == ((Garbage) o).name)) {
			return true;
		}
		return false;
		
	}
}
