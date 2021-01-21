package com.revature.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revature.models.Planet;

public interface PlanetDao extends CrudRepository<Planet, Integer>{

	/*
	 * JPARepository vs CrudRepository : what's the difference? 
	 */
	
	public List<Planet> findAll();
	public List<Planet> findByOrderByNameDesc();
	public Planet save(Planet p);
	public Planet findByName(String planetName);
	public Planet findById(int asdf);
	
}
