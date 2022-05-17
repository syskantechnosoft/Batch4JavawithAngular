package com.revature.string;

public class ArrayDemo {

	public static void main(String[] args) {
		// primitive int array
		int[] age = new int[5];// primitive int array which stores 5 elements

		int marks[] = new int[10]; // primitive int array which can store 10 elements

		// arrays are fixed in size; homogeneous array [Similar type of data]
		int[] scores = { 34, 78, 98, 78, 98, 123 };

		// heterogenous array
		Object objArray[] = { 34, 67.89f, 98923234878l, true, null, 98.87683, 'c', "welcome" };

		//enhanced for loop or for each loop
		for (Object object : objArray) {
			System.out.println(object);
		}
	}

}
