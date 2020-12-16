package com.revature.models;

public class User {

	private String name;
	private String email;
	private int order;
	private boolean isEmployee;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	public User(String name, String email, int order, boolean isEmployee) {
		super();
		this.name = name;
		this.email = email;
		this.order = order;
		this.isEmployee = isEmployee;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}


	public boolean isEmployee() {
		return isEmployee;
	}


	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", order=" + order + ", isEmployee=" + isEmployee + "]";
	}
	
	

	
	
}
