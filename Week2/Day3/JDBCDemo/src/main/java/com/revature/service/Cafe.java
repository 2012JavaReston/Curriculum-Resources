package com.revature.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.User;

public class Cafe {
	
	private static UserDao uDao = new UserDaoImpl();
	Scanner sc = new Scanner(System.in);
	
	public void createNewUser() {		
		
			User c = new User();
			List<User> existingUsers = getAllUsers();
//			List<User> existingUsers = new ArrayList<>();
			
			System.out.println("Welcome user! Enter username.");
			String name = sc.nextLine();
			c.setName(name);
			//Basic verification;
			for ( User u : existingUsers) {
				if (u.getName().equals(name)) {
					System.out.println("Username taken!  Please try again!");
					createNewUser();
				}
			}
			System.out.println("Enter password.");
			String email = sc.nextLine();
			c.setEmail(email);
			c.setOrder(0);
//			c.setEmployee(false);
			uDao.insertUser(c);
//			return (new PlanetDaoImpl()).selectPlanetByName(p.getName());
		}
	public List<User> getAllUsers() {
		return uDao.selectAllUser();
	}
	public void deleteUser() {
		System.out.println("What user would you like to delete?");
		String uName = sc.nextLine();
		if(uDao.deleteUser(uName)) {
			System.out.println("User successfully deleted.");
		} else {
			System.out.println("Ooopsie!");
		}
	}
}
