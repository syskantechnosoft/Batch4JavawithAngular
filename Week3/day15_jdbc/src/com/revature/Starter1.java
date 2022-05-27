package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.model.ErrorDetail;
import com.revature.model.User;

public class Starter1 {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String query;
	private int status;

	public Starter1() {
		super();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_schema", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ErrorDetail checkLogin(String username, String password) {
		User user = readByUsername(username);
		ErrorDetail result = new ErrorDetail();
		if (user != null) {
			if (user.getPassword().equals(password)) {
				result.setStatus(false);
			} else {
				result.setStatus(true);
				result.setErrorMessage("Invalid Password!!!!");
			}
		} else {
			result.setStatus(true);
			result.setErrorMessage("No User available");
		}
		return result;
	}

	public User readByUsername(String username) {
		User user = null;
		query = "select * from user_table where username='" + username + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getShort(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username:");
		String username = null;
		username = scan.next();
		String password = null;
		System.out.print("Enter Password:");
		password = scan.next();
		Starter1 obj = new Starter1();
		ErrorDetail error =null;
		error = obj.checkLogin(username, password);
		if (!error.isStatus())
			System.out.println("Login Successfull");
		else
			System.out.println("Error while logging in."+error.getErrorMessage());

	}

}
