package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_CRUD {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Scanner scan = new Scanner(System.in);

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_schema", "root", "1234");

		String insertQuery = "insert into employee (first_name,last_name,email,phone) values (?,?,?,?)";
		String updateQuery = "update employee set first_name=?, last_name=?, email=?,phone=? where id=?";
		String deleteQuery = "delete from employee where id=";
		String selectAllQuery = "select * from employee";
		String selectByIdQuery = "select * from employee where id=";

		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement(insertQuery);

		// Insert Operation
		pstmt.setString(1, "sample");
		pstmt.setString(2, "data");
		pstmt.setString(3, "sample_data1@gmail.com");
		pstmt.setLong(4, 9878675645l);

		int status = 0;
		status = pstmt.executeUpdate();

		if (status > 0)
			System.out.println("One Record inserted Successfully!!!!");

		// Update Operation
		pstmt = conn.prepareStatement(updateQuery);
		pstmt.setString(1, "abcd");
		pstmt.setString(2, "efgh");
		pstmt.setString(3, "abcd_efgh1@gmail.com");
		pstmt.setLong(4, 9878675645l);
		pstmt.setInt(5, 100);

		status = 0;
		status = pstmt.executeUpdate();

		if (status > 0)
			System.out.println("One Record updated Successfully!!!!");

		// Read By ID Operation
		ResultSet rs = stmt.executeQuery(selectByIdQuery + 100);

		System.out.println("Updated Record details");
		if (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
					+ "  " + rs.getLong(5));
		} else {
			System.out.println("Error in reading data for id =100");
		}

		// ReadAll Operation
		rs = stmt.executeQuery(selectAllQuery);
		System.out.println("ID   FIRST_NAME   LAST_NAME   EMAIL     PHONE  ");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "  " + rs.getString("first_name") + "  " + rs.getString(3) + "  "
					+ rs.getString(4) + "  " + rs.getLong(5));
		}

		// Delete Operation
		status = 0;
		int id = 0;
		System.out.print("Enter the Employee ID to delete :");
		id= scan.nextInt();
		status = stmt.executeUpdate(deleteQuery + id);
		if (status > 0)
			System.out.println("One Record Deleted!!!");

		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
		if (scan != null)
			scan.close();
	}

}
