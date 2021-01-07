package com.revature.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.revature.models.Planet;

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
	
//	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//
//	public static Session getSession() {
//		return sf.openSession();
//	}
	
	private static HibernateUtil hu;
	
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	private HibernateUtil() {
		
		if(sf == null) {
			
			Map<String, String> settings = new HashMap<>();
			
			settings.put("hibernate.connection.url", "jdbc:postgresql://database-1.cqoseij0k35s.us-east-2.rds.amazonaws.com/postgres");
			settings.put("hibernate.connection.username", System.getenv("DB_USERNAME"));
			settings.put("hibernate.connection.password", System.getenv("DB_PASSWORD"));
			settings.put("hibernate.connection.driver_class","org.postgresql.Driver");
			settings.put("hibernate.connection.dialect", "org.hibernate.dialect.PostgreSQLDialect");
			settings.put("hibernate.show_sql", "false");
			
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.applySettings(settings)
					.build();
			
			
			Metadata metadata = new MetadataSources(standardRegistry)
					.addAnnotatedClass(Planet.class)
					.getMetadataBuilder()
					.build();
			
			sf = metadata.getSessionFactoryBuilder().build();
			
		}
		
		
		
	}
	
	public static HibernateUtil getHibernateUtil() {
		if (hu == null) {
			hu = new HibernateUtil();
		}
		
		return hu;
	}
	
	
	
	
	
	
}
