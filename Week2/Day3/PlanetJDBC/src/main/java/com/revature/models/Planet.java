package com.revature.models;

public class Planet {
	
	private int id;
	private String name;
	private String description;
	private boolean rings;
	private int moons;
	
	
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(int id, String name, String description, boolean rings, int moons) {
		this();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rings = rings;
		this.moons = moons;
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
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	public int getMoons() {
		return moons;
	}
	public void setMoons(int moons) {
		this.moons = moons;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + ", rings=" + rings + ", moons="
				+ moons + "]";
	}
	
	

}
