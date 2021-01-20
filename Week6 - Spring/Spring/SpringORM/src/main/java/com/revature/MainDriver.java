package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Planet;
import com.revature.repository.PlanetRepo;

public class MainDriver {
	
	//Spring Container
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	private static PlanetRepo planetDao = appContext.getBean("PlanetDao", PlanetRepo.class);;
	
	private static void insertValues() {
		planetDao.insert(new Planet(0, "Earth"));
		planetDao.insert(new Planet(0, "MArs"));
		planetDao.insert(new Planet(0, "Mercury"));
		planetDao.insert(new Planet(0, "Venus"));
	}
	
	public static void main(String[] args) {
		
		insertValues();
		
		System.out.println(planetDao.selectAll());
		
		
	}

}
