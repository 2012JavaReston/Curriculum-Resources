package com.revature.comparing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ToCompare {
	
	public static void main(String[] args) {
		
		
		Planet p = new Planet(0,"Mercury");
		Planet p1 = new Planet(1,"Venus");
		Planet p2 = new Planet(3,"Mars");
		Planet p3 = new Planet(2,"Earth");
		Planet p4 = new Planet(4,"Jupiter");
		Planet p5 = new Planet(5,"saturn");
		
		List<Planet> solarSystem = new ArrayList<Planet>();
		
		solarSystem.add(p);
		solarSystem.add(p1);
		solarSystem.add(p2);
		solarSystem.add(p3);
		solarSystem.add(p4);
		solarSystem.add(p5);
		
		
		
		Set<Planet> sortedPlanetSet = new TreeSet<>(); //Can only accept datatypes that have implementded comparable, it's sorting method needs a compartTo() to be implemented!
		sortedPlanetSet.addAll(solarSystem);
		
		System.out.println(solarSystem);
		System.out.println(sortedPlanetSet);
		
		solarSystem.sort(new ComparatorClass());
		System.out.println(solarSystem);
		
//		solarSystem.so
		
		//2 ways to organise our lise
		// Comparators and comparables!
		
	}

}
