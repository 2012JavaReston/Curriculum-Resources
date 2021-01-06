package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDaoHibernate implements PlanetDao {
	
	/*
	 * Hibernate provides us with some default CRUD methods 
	 */

	@Override
	public void insert(Planet p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(p);
		
		tx.commit();
		ses.close();

	}

	@Override
	public void update(Planet p) {
		// TODO Auto-generated method stub

	}

	@Override
	public Planet selectPlanetById(int id) {
		Session ses = HibernateUtil.getSession();
		
		Planet p = ses.get(Planet.class, id);
		
		ses.close();
		return p;
	}

	@Override
	public List<Planet> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planet> selectAllPlanetsWithBlueInTheDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override 
	public List<Planet> selectPlanetByName(String name){
		
		Session ses = HibernateUtil.getSession();
		
		List<Planet> planetList = null;
		
		//Native SQL
		planetList = ses.createNativeQuery("select * from planet_table where planet_name = '" +name + "'",Planet.class).list();
		//possibility of sql injection. 
		//kinda terrible, not modular, very dependent on a specific flavor of SQL
		
		//Hibernate Query Language
		planetList = ses.createQuery("from Planet where name = '" + name + "'", Planet.class).list();
		//parse the string from HQL and convert it into our preferred sql syntax. 
		
		//Criteria API (deprecated but Criteria builder is way too many lines)
		planetList = ses.createCriteria(Planet.class).list();
		
		return planetList;
	}

	@Override
	public void delete(Planet p) {
		// TODO Auto-generated method stub

	}

}
