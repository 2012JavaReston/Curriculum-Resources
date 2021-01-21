package com.revature.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Planet;
import com.revature.repo.PlanetRepo;

@Controller
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:4200")
public class PlanetController {
	
//	private PlanetService planetService; I DONT HAVE A SERVICE AT THE MOMENT
	
	private PlanetRepo planetRepo;

	public PlanetController(PlanetRepo planetRepo) {
		super();
		this.planetRepo = planetRepo;
	}
	
	
//	@RequestMapping(value = "/getPlanets", method = RequestMethod.GET)
	@GetMapping(value = "/getPlanets") //These are identical in configuration.
	public @ResponseBody List<Planet> getAllPlanets(){
		return planetRepo.selectAll();
	}
	
	

}
