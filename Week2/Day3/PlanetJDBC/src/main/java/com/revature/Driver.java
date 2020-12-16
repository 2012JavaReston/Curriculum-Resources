package com.revature;

import com.revature.service.UniverseManager;

public class Driver {
	
	//My driver is dependent on the srevicelayer
	private static UniverseManager uM= new UniverseManager();
	
	public static void main(String[] args) {
		System.out.println("Welcome user");
		System.out.println("Choose a mode");
		
		String mode = "God";
		
		if(mode.equals("God")) {
			
//			uM.getChosenPlanet(new Planet());
			
		}
	}

}
