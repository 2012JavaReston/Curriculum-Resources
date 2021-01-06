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
	 * SessionFactory (interface)
	 * 		It's jon is it coreate sessions and store information on HOW to make connection to your database. 
	 * 		Once it's configured, it's immutable
	 * 
	 * 
	 * Session :
	 * 		Sessions manage the connection to your database and provides create, read, update and delete operations. 
	 * 
	 * 
	 * Transaction:
	 * 		Transactions manage... your transactions (and cache). Must be ACID.
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
