package com.revature.service;

import java.net.URI;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Planet;

@Service
public class PlanetService {
	
//	private Planet pDao;
	
	private final RestTemplate restTemplate;

	public PlanetService(RestTemplate restTemplate) {
	super();
	this.restTemplate = restTemplate;
}



	public List<Planet> getPlanetList() {
		
		/*
		 * My plan is to get the inner planets, then add pluto to get a list of the rocky planets
		 * and expose that via the controller
		 */
		
		//Defines the URI
		URI uri = URI.create("http://localhost:9101/api/InnerPlanets");
		
		List<Planet> rockyPlanets = null;
		
		//Actually translating the objects into my rockyPlanets
		rockyPlanets = (List<Planet>) this.restTemplate.getForObject(uri, List.class);
		
		rockyPlanets.add(new Planet("Pluto'",9));
		
		return rockyPlanets;
	}

}
