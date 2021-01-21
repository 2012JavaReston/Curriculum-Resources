package com.revature.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	@GetMapping(value = "/getPlanets") //These are identical in configuration. http://localhost:8080/SpringMVC/mvc/api/getPlanets
	public @ResponseBody List<Planet> getAllPlanets(){
		return planetRepo.selectAll();
	}
	
	@GetMapping(value = "/getPlanetsWithParam", produces="application/json", params = {"id"}) //http://localhost:8080/SpringMVC/mvc/api/getPlanetsWithParam?id=2
	public ResponseEntity<Planet> getPlanetById(int id) {
		return new ResponseEntity<Planet>(planetRepo.selectPlanetById(id), HttpStatus.INSUFFICIENT_STORAGE);
	}
	
	
	@ResponseStatus(value = HttpStatus.ALREADY_REPORTED)
	@GetMapping(value = "/getPlanetWithUrl/{num}")
	public @ResponseBody Planet getPlanetByIdTwo(@PathVariable("num") int id ) {
		return planetRepo.selectPlanetById(id);
	}
	
	
	@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT) //Status code 418, 
	@PostMapping(value = "/createPlanet", consumes = "application/json") //http://localhost:8080/SpringMVC/mvc/api/createPlanet
	public @ResponseBody String createPlanet(@RequestBody Planet incomingPlanet) {
		
		/*
		 * With the incoming JSON, jackson/Spring will ignore any EXTRA fields that don't match up to the pojo
		 * 
		 * If the incoming JSON does NOT HAVE all the fields, it will provide just default values. 
		 */
		planetRepo.insert(incomingPlanet);
		
		return "Success";
	}
	
	public void updatePlanet() {
		
	}
	
	public void deletePlanet() {
		
	}
	
	@GetMapping(value = "/allTheHeaders")
	public ResponseEntity<String> allHeaders(@RequestHeader Map<String,String> allHeaders){
		
		//THIS IS NOTHING TO DO WITH MVC
		//This is from Collections (Week 1)
		for(Entry<String, String> entry: allHeaders.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		HttpHeaders responseHeader = new HttpHeaders();
		
		responseHeader.set("Name", "Bobby");
		responseHeader.set("superSecrets", "********");
		
		return new ResponseEntity<String>("Success", responseHeader, HttpStatus.FORBIDDEN);
	}
	

}
