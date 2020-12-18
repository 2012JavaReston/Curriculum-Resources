package com.revature;


import com.revature.models.Planet;
import com.revature.service.UniverseManager;

public class Driver {
	
	//My driver is dependent on the service layer and the service layer only
	private static UniverseManager uM= new UniverseManager();
	
	public static void main(String[] args) {
		
		System.out.println(System.getenv("DB_USERNAME"));
		System.out.println(System.getenv("DB_PASSWORD"));
		System.out.println(System.getenv("random"));
		
		//creating a menu mode, you would be using a scanner object instead of hardcoding the decision
//		System.out.println("Welcome user");
//		System.out.println("Choose a mode");
//		
//		String mode = "God";
//		
//		if(mode.equals("God")) {
//			
//			uM.getChosenPlanet(new Planet());
//			
//		}
	}

}
