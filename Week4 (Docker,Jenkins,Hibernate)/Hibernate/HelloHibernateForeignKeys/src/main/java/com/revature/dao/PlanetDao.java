package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDao {
	
	
	public void insert(Planet p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(p);
		
		tx.commit();
//		ses.close();

	}

	
	public void update(Planet p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.update(p);
		
		tx.commit();
//		ses.close();

	}

	
	public Planet selectPlanetById(int id) {
		Session ses = HibernateUtil.getSession();
		
		Planet p = ses.get(Planet.class, id);
//		System.out.println(p.getMoons());
		
//		ses.close();
		return p;
	}

	
	public List<Planet> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Planet> selectAllPlanetsWithBlueInTheDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	

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
		planetList = ses.createCriteria(Planet.class).add(Restrictions.ilike("name", name)).list();
		
		return planetList;
	}

	
	public void delete(Planet p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.delete(p);
		
		tx.commit();
//		ses.close();

	}

}
