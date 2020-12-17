package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	/*
	 * JDBC - Java Database Connection
	 * 
	 * JDBC API handles databases using Java, allows us to interact with our database through CRUD methods
	 * 
	 * Important interfaces in JDBC
	 * 
	 * DriverManager
	 * Connection
	 * Statement
	 * PreparedStatement
	 */
	
	/*
	 * What do we need to connect?
	 * 
	 * We need Endpoint, username and password
	 */
	
	// The url in Java is slightly different to what we put in Dbeaver. 
	// "jdbc:postgresql://[ENDPOINT]/[DATABASE]
	private static final String URL = "jdbc:postgresql://<endpoint>/postgres";
	private static final String USERNAME ;
	private static final String PASSWORD ;
	
	private static Connection conn;
	
	public static Connection getConnection() {
		
		try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
