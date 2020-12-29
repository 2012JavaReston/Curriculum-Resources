package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	//CRUD methods
	
	//Create
	public boolean insertPlanet(Planet p);
	
	//Read
	public Planet selectPlanetById(int id);
	public Planet selectPlanetByName(String name);
	public List<Planet> selectAllPlanets();
	
	//Update
	public void updatePlanet(Planet p, String newName);
	
	//Delete
	public boolean deletePlanet(Planet p);

}
