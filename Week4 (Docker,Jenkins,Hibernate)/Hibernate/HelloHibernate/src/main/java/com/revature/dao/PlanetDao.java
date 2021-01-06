package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	//CRUD
	
	//CREATE
	public void insert(Planet p);
	
	//UPDATE
	public void update(Planet p);
	
	//READ
	public Planet selectPlanetById(int id);
	public List<Planet> selectAll();
	public List<Planet> selectAllPlanetsWithBlueInTheDescription();
	
	//DELETE
	public void delete(Planet p);

}
