package com.revature.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;
import com.revature.repo.PlanetDao;

import lombok.AllArgsConstructor;

/*
 * What is a Restful API?
 * 
 * 1) Stateless
 * 2) Client-Server
 * 3) Cacheable
 * 4) Layered System
 * 5) Unifrom Interface 
 * 6) (Optional) Code on demand. 
 */

@RestController
@AllArgsConstructor
public class RestfulPlanetController {
	
	private PlanetDao planetDao;

	/*
	 * RestFul controller assumes you're returning the object, not forwarding 
	 * 	to another resouce. 
	 */
	@GetMapping("/Planets")
	public List<Planet> getAllPlanets(){
		return planetDao.findAll();
	}
}
