package com.revature;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoHibernate;
import com.revature.models.Planet;

public class MainDriver {
	
	private static PlanetDao pdao = new PlanetDaoHibernate();
	
	public static void main(String[] apples) {

//		Planet myPlanet1 = new Planet(0, "The Sun", "Very hot");
//		Planet myPlanet2 = new Planet(0, "MErcury", "very small");
//		Planet myPlanet3 = new Planet(0, "Venus", "Very yellow");
//		Planet myPlanet4 = new Planet(0, "TEarth", "Very blue");
//		Planet myPlanet5 = new Planet(0, "Pluto", "Very cold");
		
//		pdao.insert(myPlanet1);
//		pdao.insert(myPlanet2);
//		pdao.insert(myPlanet3);
//		pdao.insert(myPlanet4);
//		pdao.insert(myPlanet5);
		
		System.out.println(pdao.selectPlanetByName("Venus"));
		
		
	}

}
