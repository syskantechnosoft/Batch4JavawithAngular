package com.revature;

@FunctionalInterface
public interface Interface3 {

	void show();

	default void display() {
		System.out.println("This is display method of Interface3");
	}

	default void welcome() {
		System.out.println("This is welcome method");
	}

	static void demo() {
		System.out.println("This is static method of Interface3");
	}
}
