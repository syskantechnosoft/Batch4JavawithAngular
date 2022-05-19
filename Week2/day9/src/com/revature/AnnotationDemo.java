package com.revature;

import java.util.Date;

public class AnnotationDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		
		System.out.println("Today is :" + today);
		
//		@SuppressWarnings("deprecation")
		Date dateOfBirth = new Date("24-Sep-1994");
		System.out.println(dateOfBirth);
		
		
		Date customDate = new Date(110, 12, 26, 23, 56);
		System.out.println(customDate);
		
		
	}

}
