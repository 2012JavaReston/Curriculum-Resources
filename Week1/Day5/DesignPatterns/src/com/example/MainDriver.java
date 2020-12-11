package com.example;

import com.example.model.BigVan;
import com.example.model.Car;
import com.example.model.VanFactory;
import com.example.model.Vehicle;

public class MainDriver {
	
	/*
	 * 
	 * Design patterns are a reusable solution to standard problems in programming. 
	 * 
	 * An example :
	 * 		A single cafe menu, so that the customer and the employees all see the same thing. 
	 * 		Our Filewriter object. 
	 * 		
	 * 
	 *	Let's create an example where we only want a single car!
	 */
	
	public static void main(String[] args) {
		
		//Family of users, which we will call with reference variables!
		
		Car timmyCar = Car.getTheCar(); // First time it's invoked we create a car! Only created once we invoke this method. 
		Car mollyCar = Car.getTheCar(); // This time, we'll return the same instance!
		Car johnsCar = Car.getTheCar(); // REturn the same instance again!
		
		johnsCar.setFuel(johnsCar.getFuel() - 20);
		
//		System.out.println(timmyCar);
//		System.out.println(mollyCar);
//		System.out.println(johnsCar);
		
		
		
		Car davidCar = Car.getTheCar(); // Accidently create new car, bad.
		
		
		
		//---------------Facotry design related code----------------------
		
		Vehicle v = VanFactory.getVehicle("Luxury");
		v = new BigVan();
		
		System.out.println(v.getClass());
		
		
		
	}

}
