package com.revature.string;

public class VarArgsExample {
	public static void someMethod(int a, int... manyInts) {
		System.out.println("First argument: " + a);
		System.out.println("Next argument: ");
		for (int i = 0; i < manyInts.length; i++) {
			System.out.println(manyInts[i]);
		}
	}

	public static void main(String[] args) {
		VarArgsExample.someMethod(1,7,8,9,90,45,5646);
		// First argument: 1
		// Next argument:
		// 3
		// 4
		// 5
		// 6
	}
}
