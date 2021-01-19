package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	/*
	 * CRUD methods  
	 */
	
	//We are only creating the sleect method bor brevity
	public List<Planet> selectAll();

}
