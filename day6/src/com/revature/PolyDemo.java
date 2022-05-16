package com.revature;

public class PolyDemo {

	// static or method overloading
	public void show() {
		System.out.println("This is no arg show method!!!");
	}

	public void show(int a) // method signature
	{
		System.out.println("This is a single int arg show method!!!");
	}

	public void show(float a) // method signature
	{
		System.out.println("This is a single float arg show method!!!");
	}

	public void show(int a, int b) // method signature
	{
		System.out.println("This is two args show method!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Having multiple methods with the same name but different signature 
		
		PolyDemo obj = new PolyDemo();
		
		obj.show();
		obj.show(5);
		obj.show(7.56f);
		obj.show(5, 10);
	}

}
