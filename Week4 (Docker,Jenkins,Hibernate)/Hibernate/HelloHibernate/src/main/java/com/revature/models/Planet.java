package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * JPA Annotation (Java Persistence API)
 * 
 * Is a standardized api that deals with mapping java objects to records 
 * Hibernate implements JPA annotations. 
 * 
 * We choose JPA over Hibernate annotations because it makes it more modular
 */

@Entity
@Table(name = "planet_table")
public class Planet {
	
	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "planet_name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "planet_description")
	private String description;
	
	public Planet(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	

}
