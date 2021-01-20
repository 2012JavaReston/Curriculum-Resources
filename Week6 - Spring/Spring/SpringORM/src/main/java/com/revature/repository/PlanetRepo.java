package com.revature.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Planet;

//Talked about sterotypes, we've only used component so far, but this here should be a repo

@Repository("PlanetDao")
@Transactional
public class PlanetRepo {
	

	private SessionFactory sesFact;
	
//	//This is how we're injecting it, but how does Spring know that we NEED it? 
//	It just does!
	public PlanetRepo(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}
	


	//CRUD
	//Create
//	@Transactional
	public void insert(Planet p) {
		
//		Session ses = sesFact.openSession();
//		Transaction tx = ses.beginTransaction();
//		
//		ses.save(p);
//		
//		tx.commit();
//		ses.close();
		
		sesFact.getCurrentSession().save(p);
		
	}
	
	//Read
//	@Transactional
	public List<Planet> selectAll(){
		return sesFact.getCurrentSession().createQuery("from Planet", Planet.class).list();
	}
	
	//Update
	public void update(Planet p) {
		
	}
	
	//Delete
	public void delete(Planet p) {
		
	}

}
