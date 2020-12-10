package com.revature.comparing;

public class Planet implements Comparable<Planet>{
	
	private int id;
	private String name;
	
	public Planet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Planet arg0) {
		
		//should have 3 return types
		/*
		 * negative values - if the object being comapred to less than 
		 * 0 - if equal 
		 * positive value - if the object is greater than
		 * 
		 */
		
		if(this.id > arg0.id) {
			return 1;
		}else if(this.id < arg0.id) {
			return -1000000000;
		}else {
			return 0;
		}
	
	}
	
	

}
