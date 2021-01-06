package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
	public void delete(Planet p) {
		// TODO Auto-generated method stub

	}

}
