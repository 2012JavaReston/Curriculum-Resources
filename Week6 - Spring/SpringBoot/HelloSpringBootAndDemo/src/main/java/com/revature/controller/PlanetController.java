package com.revature.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Planet;
import com.revature.repo.PlanetDao;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PlanetController {
	
	private PlanetDao planetDao;

//	public PlanetController(PlanetDao planetDao) {
//		super();
//		this.planetDao = planetDao;
//	}
	
	
	@GetMapping("/AllPlanets")
	public @ResponseBody List<Planet> getPlanets(){
		return planetDao.findAll();
	}
	
	@PostMapping("/insertPlanet")
	public @ResponseBody String createPlanet(@RequestBody Planet planet) {
		planetDao.save(planet);
		return "success";
	}
	
}
