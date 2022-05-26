package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static Connection conn = null;
	private static String URL = "jdbc:mysql://localhost:3306/my_schema";
	private static String username = "root";
	private static String password = "root";

	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(URL, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

