package com.example.model;

import java.io.Serializable;

public class Planet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9028511695020181447L;
	
	
	private transient int id; //Transient non-access modifier will stop the variable from being serialized!
	private String name;
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + "]";
	}

	

}
