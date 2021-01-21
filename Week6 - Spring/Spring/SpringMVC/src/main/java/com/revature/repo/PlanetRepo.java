package com.revature.repo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Planet;

@Repository("PlanetRepo")
@Transactional
public class PlanetRepo {
	

	private SessionFactory sesFact;
	

	public PlanetRepo(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}

	public void insert(Planet p) {
		sesFact.getCurrentSession().save(p);
	}
	

	public List<Planet> selectAll(){
		return sesFact.getCurrentSession().createQuery("from Planet", Planet.class).list();
	}
	
	public Planet selectPlanetById(int id) {
		return sesFact.getCurrentSession().get(Planet.class, id);
	}
	

	public void update(Planet p) {
		sesFact.getCurrentSession().update(p);
	}
	

	public void delete(Planet p) {
		sesFact.getCurrentSession().delete(p);
	}

}
