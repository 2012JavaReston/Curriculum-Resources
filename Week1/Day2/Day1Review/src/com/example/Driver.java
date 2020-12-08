package com.example;

import com.example.pojo.Human;
import com.example.pojo.vehicle.Car;
import com.example.random.Potatoe;

//import com.example.pojo.Human;

//import com.example.pojo.*;


public class Driver extends Human{
	
	//The class with the main method will be typically called the "Driver" or the "MainDriver"
	
	public void nonStaticMethod() {
		System.out.println(this.height);
	}
	
	public static void main(String[] args) {
		
		//This is a HAS-A relationship 
		Human human1 = new Human();
		
//		human1.name;
//		human1.weight;
//		System.out.println(human1.height);
//		System.out.println(human1.sSN);

		Object obj = new Object();
		Object obj2 = obj;
//		System.out.println(obj.equals(obj2)); // Why does this return false? If it's pointing to an object in another memory location. 
		
//		System.out.println(obj.getClass());
//		System.out.println(human1.getClass());
		
//		System.out.println(obj.toString());
//		System.out.println(obj + "string"); //implicitly calling on the toString() method. 
//		
//		String i = 1 + "2";
//		
//		System.out.println(i);
		
//		human1.exercise();
		
//		Potatoe p1 = new Potatoe();
		
//		System.out.println(p1.sSN);
		
//		p1.randoMethod();
		
		
		Car car1 = new Car();
		
//		car1.startCar();
		
		
	}

}
