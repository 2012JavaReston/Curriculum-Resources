package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;

public class PlanetDaoImplButBetter implements PlanetDao {

	@Override
	public List<Planet> selectAll() {
		/*
		 * Imagine this was a even better implementation.
		 */
		List<Planet> listOfPlanets = new ArrayList<Planet>();
		
		listOfPlanets.add(new Planet("Mercury"));
		listOfPlanets.add(new Planet("Venus"));
		listOfPlanets.add(new Planet("Earth"));
		listOfPlanets.add(new Planet("Mars"));
		listOfPlanets.add(new Planet("Jupiter"));
		listOfPlanets.add(new Planet("Saturn"));
	
		
		return listOfPlanets;
	}

}
