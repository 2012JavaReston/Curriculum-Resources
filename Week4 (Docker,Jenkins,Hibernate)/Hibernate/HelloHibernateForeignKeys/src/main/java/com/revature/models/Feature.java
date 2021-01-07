package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feature_table")
public class Feature {
	
	@Id
	@Column(name = "feature_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "feature_name", unique = true)
	private String name;
	

	public Feature(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Feature() {
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

	@Override
	public String toString() {
		return "Feature [id=" + id + ", name=" + name + "]";
	} 
	
	

}
