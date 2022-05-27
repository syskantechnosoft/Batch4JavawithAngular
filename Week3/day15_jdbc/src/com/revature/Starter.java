package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.model.User;

public class Starter {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String query;
	private int status;

	public Starter() {
		super();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_schema", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean checkLogin(String username, String password) {
		User user = readByUsername(username);
		boolean status = false;
		if (user!=null && user.getPassword().equals(password)) {
			status = true;
		}
		return status;
	}

	public User readByUsername(String username) {
		User user = null;
		query = "select * from user_table where username='" + username+"'";
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
		Starter obj = new Starter();
		boolean status = false;
		status = obj.checkLogin(username, password);
		if (status)
			System.out.println("Login Successfull");
		else
			System.out.println("Error while logging in.Please check username/password!!!");

	}

}
