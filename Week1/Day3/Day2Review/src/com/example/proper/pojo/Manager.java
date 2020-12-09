package com.example.proper.pojo;

public class Manager {
	
	/*
	 * private variables
	 * public getters and setters
	 * toString()
	 * Cosntructros 
	 */
	
	private String name;
	private String email;
	private long bankId;
	
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String name) {
		this.name = name;
	}


	public Manager(String name, String email, long bankId) {
		super();
		this.name = name;
		this.email = email;
		this.bankId = bankId;
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
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", email=" + email + ", bankId=" + bankId + "]";
	}
	
	

}
