package com.revature.service;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImpHardCoded;
import com.revature.models.Planet;
import com.revature.models.User;

public class PlanetFun {
	
	/*
	 * This is a service level class regarding our Planet objects. 
	 * 
	 * All the logic here is exclusively Java, we don't deal with any Http requests and response, and we don't deal with 
	 * 		sql or database related entities/methods. 
	 * 
	 * You might have a service level authentication class as well... 
	 * 		instead of defining a master user like I have, inside of our planet service class.
	 */
	
	PlanetDao pDao = new PlanetDaoImpHardCoded();
	
	public static final User masterUser = new User("Bobby");
	
	public void destroy(Planet p) {
		System.out.println("You're planet is about to be destroyed, by a asteroid");
		
		if(pDao.deletePlanet(p)) {
			System.out.println("You monster!");
		}else {
			System.out.println("It doesn't even exists!?");
		}
		
	}

	public void createLife(Planet p) {
		System.out.println("You've had enough of being a monseter");
		
		if(pDao.insertPlanet(p)) {
			System.out.println("Well done, you're a god");
		}else {
			System.out.println("Stop being a copy cat. ");
		}
	}

	public Planet findAPlanet(int id) {
		Planet p = null;
		if(pDao.selectPlanetById(id)==null) {
			System.out.println("planet does not exist");
		}else {
			p = pDao.selectPlanetById(id);
		}
		return p;
		
	}
}
