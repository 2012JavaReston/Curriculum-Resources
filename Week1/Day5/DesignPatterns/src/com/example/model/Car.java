package com.example.model;

public class Car implements Vehicle{
	
	
	private String name;
	private double fuel;
	private double mileage;
	
	// This is an example of lazy loading
	private static Car onlyCar = null; //This does not belong to the object, but the CLASS
	
	// This is an example of eager loading!
	private static Car familyVan = new Car(); 
	
	
	public static Car getTheCar() {
		
		if(onlyCar == null) { //If car does not exist, then we instantiate a new CAr.
			onlyCar = new Car("Timmy's", 100, 1000);
			return onlyCar;
		} else if(onlyCar != null) { //If it already exists, we return that instance. 
			return onlyCar;
		}
		
		return null;
	}
	
	
	private Car(String name, double fuel, double mileage) {
		super();
		this.name = name;
		this.fuel = fuel;
		this.mileage = mileage;
	}
	
	private Car(String name) {
		//A little of constructor chaining!
		this(name,100,-1); //-1 mileage so that I can notify later code that this is unknown 
	}
	
	private Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", fuel=" + fuel + ", mileage=" + mileage + "]";
	}

	
	
}
