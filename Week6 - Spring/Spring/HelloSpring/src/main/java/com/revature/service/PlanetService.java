package com.revature.service;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetService {
	
	/*
	 * Where the business logic goes. 
	 */
	
	public List<Planet> getTheSolarSystem();
	
	public List<Planet> getTheInnerPlanets();
	
	public void destroyAllPlanets();
	
	public void terraformPlanet(Planet p);
	
	public boolean GodPrivelleges();

}
