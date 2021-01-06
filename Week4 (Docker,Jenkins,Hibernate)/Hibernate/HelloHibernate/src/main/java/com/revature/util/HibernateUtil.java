package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	/*
	 * Hibernate has some important objects and interfaces 
	 * 
	 * Configuration  (class)
	 * 			Configuration's job is to gather infromation from our xml file and use that to create 
	 * 			a session factory. 
	 * 
	 * SessionFactory 
	 * 
	 * Session 
	 * 
	 * Transaction:
	 * 		ACID?
	 * 			Atomicity:
	 * 			Consistency:
	 * 			Isolation 
	 * 			Durability
	 */
	
	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	public static Session getSession() {
		return sf.openSession();
	}
}
