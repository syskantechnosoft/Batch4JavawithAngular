package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// 1) Load & Register the Driver (Depends on the DBMS used)
		Class.forName("com.mysql.cj.jdbc.Driver");

		String username = "root";
		String password = "root";
		// http://www.gmail.com
		String url = "jdbc:mysql://localhost:3306/my_schema";

//	2)	Establish the Connection between Java and RDBMS
		Connection conn = DriverManager.getConnection(url, username, password);
//	3)	Create Query to Execute (Statement, Prepared Statement, CallableStatement)
		String query = "select * from employee";
		Statement stmt = conn.createStatement();
//	4)	Execute the Query, Store the Result in ResultSet and process it
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("Employee Table Contents");
		System.out.println("ID \t FirstName \t LastName \t Email \t\t Mobile");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "\t" + rs.getString("first_name") + "\t\t" + rs.getString("last_name")
					+ "\t\t" + rs.getString("email") + "\t" + rs.getLong("phone"));
		}
//	5)	Close all the resources.
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();

	}

}
