package com.revature;

public class MethodDemo {
	
	public void display() {
		System.out.println("This is No Argument No return Method!!!");
	}
	
	public String display1() {
		return "This is No Argument with return method!!!";
	}
	
	public void display(int result) {
		System.out.println("This is with argument and No return method!!! Result is ="+result);
	}

	
	public String display(int a, int b) {
		String add ="50";
		return add ; //"This is with argument and with return method!!!! result ="+(a+b);		
	}
	
	public static void staticMethod() {
		System.out.println("This is a static Method!!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo obj1 = new MethodDemo();
		obj1.display();
		System.out.println(obj1.display1());
		obj1.display(25);
		System.out.println(obj1.display(5, 10));
		
		MethodDemo.staticMethod(); // static methods can be called using the class name
	}

}
