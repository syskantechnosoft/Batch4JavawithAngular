package com.revature;

public class DoWhile {

	public static void main(String[] args) {
		int a = 100;
		int reverse;
		do {
			reverse = 0;
			int temp = a;
			while (temp > 0) {
				reverse = (reverse * 10) + (temp % 10);
				temp /= 10;
			}
			if (reverse == a)
				System.out.println(a + " is a palindrome number");
			a++;
		} while (a < 1000);

	}

}
