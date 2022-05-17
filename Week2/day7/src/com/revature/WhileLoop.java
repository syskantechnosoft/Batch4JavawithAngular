package com.revature;

public class WhileLoop {

	public static void main(String[] args) {
		int a = 5678;
		int reverse = 0;
		
		// a/=10(shorthand divide &assign operator) === a=a/10 (Normal division operator);
		while (a > 0) {
			reverse = (reverse *10) + (a%10);
			a/=10; //a=a/10;
		}
		System.out.println("Reverse value =" + reverse);
	}

}
