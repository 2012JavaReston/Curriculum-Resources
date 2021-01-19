package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;
import com.revature.security.AuthLayer;

@Component("PlanetServiceFullAnno")
public class PlanetServiceImpl implements PlanetService {
	
	/*
	 * Our service layer needs an instance of our dao layer
	 * i.e. it's is dependent on the dao layer
	 * i.e. it has a dependency. 
	 */
	
//	@Autowired //Tells spring to inject variables using Field Injection
	private PlanetDao pDao;
	/*
	 * Field Injection is bad in some ways: 
	 * 		Lack of Encapsulation 
	 * 		Unable to trigger additional setter or constructor logic 
	 * 		Tightly coupes our application to the Spring IoC Container (not all frameworks allow us to do field injection)
	 */
	
//	@Autowired
	private AuthLayer aLay;

	public PlanetServiceImpl() {
		super();
		System.out.println("INSIDE NO ARGS!");
	}
	
	public PlanetServiceImpl(PlanetDao pDao) {
		
		super();
		System.out.println("INSIDE SINGLE ARGS CONSTRUCTOR!");
		this.pDao = pDao;
	}

	@Autowired //You add @Autowired above the type of injection you want, in this case constructor. 
	public PlanetServiceImpl(PlanetDao pDao, AuthLayer aLay) {
		
		super();
		System.out.println("INSIDE ALL ARGS CONSTRUCTOR!");
		this.pDao = pDao;
		this.aLay = aLay;
	}
	
	

	public AuthLayer getaLay() {
		return aLay;
	}

	@Autowired
	public void setaLay(AuthLayer aLay) {
		this.aLay = aLay;
	}

	public PlanetDao getpDao() {
		return pDao;
	}

	@Autowired //Now we're using setter injection
	public void setpDao(PlanetDao pDao) {
		System.out.println("INSIDE SETTER");
		this.pDao = pDao;
	}

	@Override //Now we're using setter injection
	public List<Planet> getTheSolarSystem() {
		return pDao.selectAll();
	}

	@Override
	public List<Planet> getTheInnerPlanets() {
		List<Planet> inners = pDao.selectAll();
		inners.remove(4);
		return inners;
	}

	@Override
	public void destroyAllPlanets() {
		// TODO Auto-generated method stub

	}

	@Override
	public void terraformPlanet(Planet p) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean GodPrivelleges() {
		// TODO Auto-generated method stub
		return aLay.checkUser();
	}

}
