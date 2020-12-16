package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCafeFactory {

	
	private static final String URL = "jdbc:postgresql://planet-db.cajbwopfnhwq.us-east-2.rds.amazonaws.com/postgres";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "jowill7!";

	private static Connection conn;
	
	public static Connection getConnection() {
		
		try {
			if(conn==null) {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
