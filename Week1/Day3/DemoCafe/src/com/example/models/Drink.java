package com.example.models;

public class Drink extends MenuItems{
	
	private double capacity;

	
	
	public Drink(String name, double calories, double price, double capacity) {
		super(name, calories, price);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Drink [capacity=" + capacity + ",price=" + this.getPrice() + "]";
	}

	
	
	
	
	

}
