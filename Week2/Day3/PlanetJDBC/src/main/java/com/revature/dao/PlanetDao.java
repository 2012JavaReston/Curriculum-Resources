package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	//I want to define the CRUD methods 
	
	//Create methods 
	public void insertPlanet(Planet p);
	
	//READ methods defined
	public Planet selectPlanetByName(String s);
	public List<Planet> selectAll();
	public List<Planet> selectRingedPlanets();
	
	//UPDATE
	public void updatePlanet(Planet p);
	
	//DELETE
	public void deletePlanet(Planet p);
	

}
