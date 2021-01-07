package com.revature.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "planet_table")
public class Planet {
	
	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="planet_name", unique=true, nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "myPlanet", fetch = FetchType.EAGER)
	private List<Moon> moons = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Feature> planetFeatures;
	
	

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Planet(int id, String name, List<Moon> moons, List<Feature> planetFeatures) {
		super();
		this.id = id;
		this.name = name;
		this.moons = moons;
		this.planetFeatures = planetFeatures;
	}



	public Planet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Moon> getMoons() {
		return moons;
	}

	public void setMoons(List<Moon> moons) {
		this.moons = moons;
	}

	public List<Feature> getPlanetFeatures() {
		return planetFeatures;
	}

	public void setPlanetFeatures(List<Feature> planetFeatures) {
		this.planetFeatures = planetFeatures;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", moons=" + moons + ", planetFeatures=" + planetFeatures + "]";
	}
	
	
	
	

	
	
	
	

}
