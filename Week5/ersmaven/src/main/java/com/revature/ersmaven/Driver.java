package com.revature.ersmaven;

import java.util.Optional;
import java.util.Scanner;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

public class Driver {

	public static void main(String[] args) {
		UserDAO userDao = new UserDAO();
		System.out.println("******************Welcome to ERS Java Application******************");
		System.out.println(" \t\t\t\t 1. Login ");
		System.out.println(" \t\t\t\t 2. Register ");
		System.out.println(" \t\t\t\t 3. Exit ");
		int choice = 0;
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter your choice [1-3]");
		choice = input.nextInt();
		String username = null;
		String password = null;
		switch (choice) {
		case 1:
			System.out.print("Enter username :");
			username = input.next();
			System.out.print("Enter password :");
			password = input.next();
			User user = userDao.getByUsername(username).get();
			if (user != null) {
				if (password.equals(user.getPassword())) {
					System.out.println("Login Successfull!!!!!");
				} else {
					System.out.println("Please check the password entered!!!");
				}
			} else {
				System.out.println("Please check the username entered!!!");
			}

			break;
		case 2:
			break;
		case 3:
			System.out.println("*************  Thanks for using LRS. Have a Great Day  **************");
			System.exit(0);
		default:
			break;
		}

		input.close();

	}
}
