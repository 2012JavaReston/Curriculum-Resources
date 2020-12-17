package com.revature;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImpl;
import com.revature.service.UniverseManager;

public class Driver {
	
	//My driver is dependent on the srevicelayer
	private static UniverseManager uM= new UniverseManager();
	
	private static PlanetDao pDao = new PlanetDaoImpl();
	private static PlanetDao pDao2 = new PlanetDaoImpl();
	
	public static void main(String[] args) {
		System.out.println("Welcome user");
		System.out.println("Choose a mode");
		
		System.out.println(pDao.selectAllPlanets());
//		System.out.println(pDao2.selectAllPlanets());
		
		String mode = "God";
		
		if(mode.equals("God")) {
			
//			uM.getChosenPlanet(new Planet());
			
		}
	}

}
