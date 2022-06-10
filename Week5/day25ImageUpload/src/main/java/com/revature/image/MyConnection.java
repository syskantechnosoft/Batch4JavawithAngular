package com.revature.image;

import java.sql.*;

public class MyConnection {

	public static Connection getConnection() {

		// As java.sql package classes contains Checked Exceptions,
		// we have to surround it with  Try/Catch Block.
		try {

			// We have to register the  Driver class present in
			// com.mysql.jdbc package.
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// To get the connection, 3 params need to be passed in
			// DriverManager.getConnection() method.

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ers", "root",
					"root");

			/*
			 * 1. URL: "jdbc:mysql://", is the address "localhost: " is the local machine
			 * and "3306" is the port number and "FileUploadDatabase" is the name of the
			 * database.
			 * 
			 * 2. UserName: "root", which is set while creating a database server in MySql
			 * Workbench. 3. Password: "root"
			 */

			return con;
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		return null;
	}
}
