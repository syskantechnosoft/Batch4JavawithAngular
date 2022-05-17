package com.revature;

public class NestedIf {

	public static void main(String[] args) {
		int a = 25;
		int b = 65;
		int c = 21;
		//Nested if and else if ladder example
		if (a > b) {
			if (a > c)
				System.out.println(" A is big ");
			else
				System.out.println(" C is big ");
		} else if (b > c) {
			System.out.println(" B is big ");
		} else {
			System.out.println(" C is big ");
		}
		System.out.println("Finished Program Execution");
	}

}
