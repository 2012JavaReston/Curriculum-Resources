package com.revature.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.models.Planet;

public class PlanetDaoImpHardCoded implements PlanetDao {
	
	//Rather than connect to a database, we will just have a collection entity 
	
	private static Set<Planet> planetSet = new HashSet<>();
	
	//Adding some default methods
	static {
		planetSet.add(new Planet(0, "Sun", "look up"));
		planetSet.add(new Planet(1, "Mercury", "look up with a telescope"));
		planetSet.add(new Planet(2, "Venus", "look up on a very dark night"));
		planetSet.add(new Planet(3, "Earth", "look down"));
	}

	@Override
	public boolean insertPlanet(Planet p) {
		
		return planetSet.add(p);
	}

	@Override
	public Planet selectPlanetById(int id) {
		Planet planet = null;
		for(Planet p: planetSet) {
			if(p.getId()==id) {
				planet = p;
			}
		}
		return planet;
	}

	@Override
	public Planet selectPlanetByName(String name) {
		Planet planet = null;
		for(Planet p: planetSet) {
			if(p.getName().equals(name)) {
				planet = p;
			}
		}
		return planet;
	}

	@Override
	public List<Planet> selectAllPlanets() {
	
		List<Planet> planetList = new ArrayList<>();
		planetList.addAll(planetSet);
		return planetList;
	}

	@Override
	public void updatePlanet(Planet p, String newName) {

		planetSet.remove(p);
		p.setName(newName);
		planetSet.add(p);
	}

	@Override
	public boolean deletePlanet(Planet p) {
		// TODO Auto-generated method stub
		return planetSet.remove(p);
	}

}
