package com.revature.models;

public class Planet {
	
	private int id;
	private String name;
	private String pictureUrl;
	
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Planet(int id, String name, String pictureUrl) {
		super();
		this.id = id;
		this.name = name;
		this.pictureUrl = pictureUrl;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (id != other.id)
			return false;
		return true;
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
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", pictureUrl=" + pictureUrl + "]";
	}
	
	

}
