package com.revature;

public interface AnotherInterface {

	void show();

	default void display() {
		System.out.println("This is display method");
	}

	static void output() {
		System.out.println("This is static output method");
	}

}
