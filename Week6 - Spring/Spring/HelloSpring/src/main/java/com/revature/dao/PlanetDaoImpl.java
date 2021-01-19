package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.revature.models.Planet;

/*
 * Sterotype are annotations that tell Spring that THIS class is a Spring bean and should be treated as such 
 * 
 * There i a hierarchy to these annotations. the ancestor tag is @Component
 * 
 * @Component is used for a basic java class, that needs to be a bean but doesn't fit into a predetermined spot in 
 * 		these design patterns. 
 * 
 * 
 * @Service : service/business classes
 * @Repository : repo/dao classes
 * @Controller: is used for controller classes 
 * 
 * @restController: is the same as controller but it assumes your API will be a RESTful api. 
 * 
 * @Configuration: is used for classes that have functionality to configure Spring 
 * 
 * 
 * @Bean IS NOT A STEROTYPE. @Bean is used inside of @Configuration classes to have the return value of a method. 
 */



@Component //Sterotypes don't need to be given more metadat if don't want to... but you should at least name it. 
public class PlanetDaoImpl implements PlanetDao {
	
	

	@Override
	public List<Planet> selectAll() {
		
		/*
		 * Here is where we would connect to the database 
		 * But for speed, I'll hardocrded it in.
		 */
		
		List<Planet> listOfPlanets = new ArrayList<Planet>();
		
		listOfPlanets.add(new Planet("Mercury"));
		listOfPlanets.add(new Planet("Venus"));
		listOfPlanets.add(new Planet("Earth"));
		listOfPlanets.add(new Planet("Mars"));
		listOfPlanets.add(new Planet("Jupiter"));
	
		
		return listOfPlanets;
	}

}
