package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteOperation {

	public static void main(String[] args) throws Exception {
		//Step 1: Loading and Registering the driver (This is optional step)
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_schema", "root", "root");
		Statement stmt = conn.createStatement();
		int status = 0;
		int id = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ID of the Employee to Delete: ");
		id = scan.nextInt();
		status = stmt.executeUpdate("delete from employee where id=" + id);
		scan.close();
		if (status > 0)
			System.out.println("One Record Deleted Successfully!!!");
	}

}
