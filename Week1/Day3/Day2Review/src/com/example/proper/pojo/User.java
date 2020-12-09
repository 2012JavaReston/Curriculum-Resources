package com.example.proper.pojo;

public class User {
	
	/*
	 * name 
	 * email address 
	 * id number 
	 * adminPrivelleges 
	 */
	
	private String name;
	private String emailAddress;
	private long idNumber;
	private boolean adminPrivelleges;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(String name, String emailAddress, long idNumber, boolean adminPrivelleges) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.idNumber = idNumber;
		this.adminPrivelleges = adminPrivelleges;
	}



	//Getter and setter for my name
	public String getName() { //getter
		/*
		 * buesiness logic 
		 */
		return this.name;
	}
	
	public void setName(String name) { //setter 
		/*
		 * Regex checking : name is valid 
		 * 	(Regular expressions, a way of checking string patterns)
		 * 
		 * Security check 
		 * 
		 * log the information 
		 */
		this.name = name;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public boolean isAdminPrivelleges() {
		return adminPrivelleges;
	}

	public void setAdminPrivelleges(boolean adminPrivelleges) {
		this.adminPrivelleges = adminPrivelleges;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", emailAddress=" + emailAddress + ", idNumber=" + idNumber
				+ ", adminPrivelleges=" + adminPrivelleges + "]";
	}
	
	
	
	
//	@Override 
//	public String toString() {
//		return "User = {name:" + this.name +", email:" + this.emailAddress + "}";
//	}
	
	
	/*
	 * Access modifiers
	 * 		public 
	 * 		protected
	 * 		(default)
	 * 		private
	 */
	
	/*
	 * POJO vs Java Beans:
	 * 		When we create models, we have to encapsulate our object
	 * 			We have private variables and public getters and setter methods to 
	 * 			grab the information 
	 * 
	 * 		We also want to create a valid toString() method
	 * 		We also want to provide constructors
	 * 		We also want a toString method for us
	 */
	
	

}
