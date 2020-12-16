package com.revature.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.User;

public class Cafe {
	
	private static UserDao uDao = new UserDaoImpl();
	
	public void createNewUser() {		
		
			User c = new User();
			System.out.println("Welcome user");
			
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			c.setName(name);
			String email = sc.next();
			c.setEmail(email);
			c.setOrder(0);
			c.setEmployee(false);
			uDao.insertUser(c);
//			return (new PlanetDaoImpl()).selectPlanetByName(p.getName());
		}
		
		/*
		 * sc.scanner.ask(what do you want)
		 * imputtFood = sc.nextLine();
		 * 
		 * Order o = new Order();
		 * o.add(imputFood)
		 * 
		 * c.addOrder(o)
		 * 
		 * CustomerDao cs = new CustomerDaoImpl();
		 * cs.insertOrder(o);
		 * cs.updateCustomer(c)
		 * 
		 */
		
//		
//	}
//	
//	public void createCustomerProfile() {
//		/*
//		 * List<Customer> Clist = CustomerDao.selectAll()
//		 * 
//		 * if(Clist.contains(c){
//		 * CustomerDao.insertCustomer(c);
//		 * }else{
//		 * sysout(customer does not exist)
//		 * }
//		 * 
//		 */
//		
//	}

}
