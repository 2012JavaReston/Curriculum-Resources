package com.revature.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.revature.models.Planet;

@Service
public class PlanetService {
	
//	private Planet pDao;
	
	private final RestTemplate restTemplate;

	public PlanetService(RestTemplate restTemplate) {
	super();
	this.restTemplate = restTemplate;
}


	@HystrixCommand(fallbackMethod="goodAllReliable")
	public List<Planet> getPlanetList() {
		
		/*
		 * My plan is to get the inner planets, then add pluto to get a list of the rocky planets
		 * and expose that via the controller
		 */
		
		//Defines the URI
//		URI uri = URI.create("http://localhost:9101/api/InnerPlanets"); This is targeting a single instance
		URI uri = URI.create("http://localhost:7000/api/InnerPlanets"); //This is targetting Zuul gateway, so now we're more 
																		// tolerant to instance failures. 
		
		List<Planet> rockyPlanets = null;
		
		//Actually translating the objects into my rockyPlanets
		rockyPlanets = (List<Planet>) this.restTemplate.getForObject(uri, List.class);
		
		rockyPlanets.add(new Planet("Pluto'",9));
		
		return rockyPlanets;
	}
	@HystrixCommand(fallbackMethod = "evenMoreReliable")
	public List<Planet> goodAllReliable(){
		List<Planet> rockyPlanets = null;
		
		URI uri = URI.create("http://localhost:7100/api/InnerPlanets");
				
		rockyPlanets = (List<Planet>) this.restTemplate.getForObject(uri, List.class);
		
		rockyPlanets.add(new Planet("Pluto'",9));
		
		return rockyPlanets;
	}
	
	
	public List<Planet> evenMoreReliable(){
		
		List<Planet> fakeList = new ArrayList<>();
		
		fakeList.add(new Planet("Fakey Fake from even more reliable", -1000));
		
		return fakeList;
	}
}
