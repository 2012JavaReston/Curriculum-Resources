package com.revature.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;
import com.revature.service.PlanetService;

@RestController
public class PlanetController {
	
	private PlanetService planetService;

	public PlanetController(PlanetService planetService) {
		super();
		this.planetService = planetService;
	}
	
	
	@GetMapping("/rocky")
	public List<Planet> getPlanets(){
		return planetService.getPlanetList();
	}
	
	

}
