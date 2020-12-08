package com.example.pojo.vehicle;

public class Car {
	
	public String name;
	public double mileage;
	
	//HAS-A relationship 
	public Engine myEngine;
	public Tyre[] myTyres;
	
	
	//When no constructor is defined, the JVM will provide a constructor 
	/*
	 * Car(){}
	 */

	public Car(){
		//implement logic 
		//We don't need to use the this keyword, because there;s nothing else competing for that name (in that scope)
		this.mileage = 100000;
		this.name = "Toyota Corolla";
		this.myEngine = new Engine();
		myTyres = new Tyre[4];
		for(int i = 0;i<myTyres.length -1;i++) {
			myTyres[i] = new Tyre();
		}
	}
	
	public void startCar() {
		this.myEngine.start();
		this.myEngine.start(true);
		this.myEngine.start(100);
		this.myEngine.start(100.0,true);
	}

}
