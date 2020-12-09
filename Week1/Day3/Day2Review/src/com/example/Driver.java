package com.example;

import com.example.proper.pojo.*;

public class Driver {
	
	private static final String PI = "3.14";// Final static variables should be in all caps
	
	//databasue url 
	// website url 
	
	public static Manager createManager() {
		/*
		 * business logic to manage the creation of the Manager
		 * 
		 * Check that all the inputs are valid 
		 */
		
		String name = "bob";
		String email = "bob";
		long id = 0000000;
		
		return new Manager(name, email, id);
		
	}
	
	public static void main(String[] arggs) {
		
		User user1 = new User();
		
//		user1.name = "Bob";
		user1.setName("Bob");
		System.out.println(user1.getName());
		
		//own validation logic every time I manipulate the name
//		user1.name = "Billy";
		
		
		
//		user1.emailAddress = "bob@building.com";
		user1.setEmailAddress("bob@building.com");
		System.out.println(user1.getEmailAddress());
		
		System.out.println(user1);
		
		
//		user1.adminPrivelleges = true;
//		user1.idNumber = 1020304;
//		
//		user1.adminPrivelleges = false;
		
		/*
		 * inside our busines logic 
		 * 
		 * if(user.adminPrivelleges == true){
		 * 		// more business logic)
		 * }
		 */
		
		
	}

}
