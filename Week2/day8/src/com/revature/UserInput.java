package com.revature;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter a number : ");
		int value1 = 0;
		value1 = scan.nextInt();
		
		System.out.println("Entered Number is :" + value1);
		
		for (int i=1;i<5;i++)
			System.out.printf("%4d",i); //formatted input - c style syntax - %d - Format specifier
				
		scan.close();
	}

}
