package com.revature;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // Using standard input device for getting user input

		String name = " ";
		String qualification = null;

		System.out.print("Enter Name :");
		name = input.nextLine();

		System.out.print("Enter Qualification:");
		qualification = input.nextLine();
		
		

		System.out.println("User Name is :" + name + " Qualification is :" + qualification);
	}

}
