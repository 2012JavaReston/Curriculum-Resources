package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionCafeFactory {

	static Dotenv dotenv = Dotenv.load();
	
	
	
	//jdbc:postgresql:// <endpoint> / db name
	private static final String URL = dotenv.get("DB_URL");
	private static final String USERNAME = dotenv.get("DB_UNAME");
	private static final String PASSWORD = dotenv.get("DB_PASS");

	private static Connection conn;
	
	public static Connection getConnection() {
		
		try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
