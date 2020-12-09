package com.example.models;


public class Food extends MenuItems{
	
	private boolean warm;
	
	

	public Food(String name, double calories, double price, boolean warm) {
		super(name, calories, price);
		this.warm = warm;
	}

	public boolean isWarm() {
		return warm;
	}

	public void setWarm(boolean warm) {
		this.warm = warm;
	}
	
	
	

}
