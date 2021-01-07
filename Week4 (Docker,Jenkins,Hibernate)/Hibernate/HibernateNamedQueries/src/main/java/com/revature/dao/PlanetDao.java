package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDao {
	
	private HibernateUtil hb = HibernateUtil.getHibernateUtil();
	
	public List<Planet> selectAll(){
		Session ses = hb.getSf().openSession();
		
		List<Planet> planetList = ses.getNamedQuery("SQL_GET_ALL_PLANETS").list();
		
		return planetList;
	}
	
	public Planet selectVenusByName() {
		Session ses = hb.getSf().openSession();
		

		
		return (Planet) ses.getNamedQuery("HQL_GET_PLANET_BY_NAME").list().get(0);
	}

}
