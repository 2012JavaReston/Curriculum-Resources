package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;

@RestController
@RequestMapping("/api")
public class PlanetController {

	@GetMapping("/InnerPlanets")
	public List<Planet> getSomePlanets(){
		List<Planet> innerPlanets = new ArrayList<>();
		
		Planet p1 = new Planet("Mercury",1);
		Planet p2 = new Planet("Venus",2);
		Planet p3 = new Planet("Earth",3);
		Planet p4 = new Planet("Mars",4);
		
		innerPlanets.add(p1);
		innerPlanets.add(p2);
		innerPlanets.add(p3);
		innerPlanets.add(p4);
		
		return innerPlanets;
	}
}
