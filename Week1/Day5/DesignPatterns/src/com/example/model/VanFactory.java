package com.example.model;

public class VanFactory {
	
	//A Factory design pattern will abstract away the creation of the models. 
	
	
	public static Vehicle getVehicle(String type) {
		//Best practice: You only want to have a single return statement.
		Vehicle toBeSentOff = null;
		
		if(type.equals("Big")) {
			
			toBeSentOff = new BigVan();
			
		}else if(type.equals("Small")) {
			
			toBeSentOff = new SmallVan();
		}else if(type.equals("Luxury")) {
			
			toBeSentOff = new LuxuryVan(4,1,gold);
		}
		
		System.out.println("Welcome to the factory, here's the vehicle!");
		
		return toBeSentOff; //Try to have a single return statement!
	}

}
