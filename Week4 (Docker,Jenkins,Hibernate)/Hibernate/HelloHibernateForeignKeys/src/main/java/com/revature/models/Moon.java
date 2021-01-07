package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "moon_table")
public class Moon {
	
	@Id
	@Column(name = "moon_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "moon_name", unique = true)
	private String name; 
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "planet_foreign_key")
	private Planet myPlanet;
	
	

	public Moon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moon(int id, String name, Planet myPlanet) {
		super();
		this.id = id;
		this.name = name;
		this.myPlanet = myPlanet;
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

	public Planet getMyPlanet() {
		return myPlanet;
	}

	public void setMyPlanet(Planet myPlanet) {
		this.myPlanet = myPlanet;
	}

	@Override
	public String toString() {
		return "Moon [id=" + id + ", name=" + name + ", myPlanet=" + myPlanet.getName() + "]";
	}
	
	

}
