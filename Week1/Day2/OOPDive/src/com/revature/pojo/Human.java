package com.revature.pojo;

public class Human extends Animal{
	
	private String name;
	private double weight;
	
	@Override
	public void jumpAHurdle() {
		System.out.println("This is a human jumping!");
		
		/*
		 * 100 lines of logic implemented here laready
		 */
	}
	
	public void doDeskWork() {
		System.out.println("Look at my opposable thumbs!");
	}

}
