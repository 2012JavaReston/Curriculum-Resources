package com.revature.pojo.vehicle;

public abstract class Jaguar implements Car {

	/*
	 * Abstract classes allow you to have both concrete methods and abstract methods 
	 * In this case we have 6 abstract methods we inherited, implementinng 4 of them. 
	 */
	
	private double price;
	private int seats;
	
	//Why don't I get a constructor?
	// If I provide ANY constructor, JVM won't provide me one. 
	
//	public Jaguar() {
//		
//	}
	
	public Jaguar(double price, int seats) {
		this.price = price;
		this.seats = seats;
	}
	
	public void refuel() {
		// TODO Auto-generated method stub
		
	}

	
	public void start() {
		// TODO Auto-generated method stub
		
	}

	
	public void stop() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void heatedSeats(); //creating an abstract method 

}
