package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.FeatureDao;
import com.revature.dao.MoonDao;
import com.revature.dao.PlanetDao;
import com.revature.models.Feature;
import com.revature.models.Moon;
import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class MainDriver {
	
	private static PlanetDao pDao = new PlanetDao();
	private static MoonDao mDao = new MoonDao();
	private static FeatureDao fDao = new FeatureDao();
	
	public static void insertInitialValues() {
		
		Planet mercury = new Planet(0,"Mercury");
		Planet venus = new Planet(0, "Venus");
		Planet earth = new Planet(0,"Earth");
		Planet mars = new Planet(0, "Mars");
		Planet jupiter = new Planet(0,"Jupiter");
		
		Moon theMoon = new Moon(0, "The Moon", earth);
		Moon pheobe = new Moon(0, "Pheobe", mars);
		Moon deimos = new Moon(0,"Deimos",mars);
		
		Feature f1 = new Feature(0,"Rings");
		Feature f2 = new Feature(0,"Iron core");
		Feature f3 = new Feature(0,"Atmosphere");
		Feature f4 = new Feature(0,"Volcanoe");
		
		List<Feature> featuresOfEarth = new ArrayList<>();
		List<Feature> featuresOfVenus = new ArrayList<>();
		List<Feature> featuresOfMars = new ArrayList<>();
		List<Feature> featuresOfJupiter = new ArrayList<>();
		
		featuresOfEarth.add(f2);
		featuresOfEarth.add(f3);
		featuresOfEarth.add(f4);
		
		featuresOfVenus.add(f3);
		
		featuresOfJupiter.add(f1);
		featuresOfJupiter.add(f2);
		featuresOfJupiter.add(f4);
		
		earth.setPlanetFeatures(featuresOfEarth);
		venus.setPlanetFeatures(featuresOfVenus);
		jupiter.setPlanetFeatures(featuresOfJupiter);
		
		Moon m1 = new Moon(0,"Jup's moon 1", jupiter);
		Moon m2 = new Moon(0,"Jup's moon 2", jupiter);
		Moon m3 = new Moon(0,"Jup's moon 3", jupiter);
		Moon m4 = new Moon(0,"Jup's moon 4", jupiter);
		
		List<Moon> moonsOfEarth = new ArrayList<>();
		List<Moon> moonsOfMars = new ArrayList<>();
		List<Moon> moonsOfJupiter = new ArrayList<>();
		
		moonsOfEarth.add(theMoon);
		moonsOfMars.add(deimos);
		moonsOfMars.add(pheobe);
		
		moonsOfJupiter.add(m1);
		moonsOfJupiter.add(m2);
		moonsOfJupiter.add(m3);
		moonsOfJupiter.add(m4);
		
		mDao.insert(m1);
		mDao.insert(m2);
		mDao.insert(m3);
		mDao.insert(m4);
		mDao.insert(theMoon);
		mDao.insert(pheobe);
		mDao.insert(deimos);
		
		pDao.insert(mercury);
		pDao.insert(venus);
		pDao.insert(earth);
		pDao.insert(mars);
		pDao.insert(jupiter);
		
		fDao.insert(f1);
		fDao.insert(f2);
		fDao.insert(f3);
		fDao.insert(f4);
		
		
		
	}

	
	public static void main(String[] args) {
	
		insertInitialValues();
		
		HibernateUtil.closeSession();
		
		
		Planet p1 = pDao.selectPlanetByName("Jupiter").get(0);
		
		
//		Planet p2 = pDao.selectPlanetById(4);
		
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		System.out.println(p1.getMoons());
		System.out.println(p1.getPlanetFeatures());
		
//		System.out.println(p2.getName());
//		System.out.println(p2.getId());
//		System.out.println(p2.getMoons());
		
		
		
		
		

	}

}
