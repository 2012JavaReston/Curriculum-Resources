package com.revature.service;

import java.util.List;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImpl;
import com.revature.models.Planet;

public class UniverseManager {
	
	//dependency, my services classes are dpenendent on my dao classes 
	private static PlanetDao pDao = new PlanetDaoImpl();
	
	public Planet getChosenPlanet(Planet p) { 
		System.out.println("Welcome user");
		System.out.println("You've selected God mode, you can choose a planet ");
		
		return pDao.selectPlanetByName(p.getName());
	}
	
	public void destroyUniverse() {
//		PlanetDao pDao = new PlanetDaoImpl();
		List<Planet> pList= pDao.selectAllPlanets();
		
		for(Planet p: pList) {
			pDao.deletePlanet(p);
		}
	}

}
