package com.revature;

public class DynaPolyDemo extends PolyDemo{
	
	public void show() {
		System.out.println("this is derived show method!!");
	}

	public void show(int a) // method signature
	{
		System.out.println("This is derived single int arg show method!!!");
	}

	public void show(float a) // method signature
	{
		System.out.println("This is derived single float arg show method!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynaPolyDemo obj = new DynaPolyDemo();
		
		PolyDemo obj1 = new PolyDemo();
		
		PolyDemo obj2 = new DynaPolyDemo();
		
		obj1.show();
		obj2.show();
		
		obj.show();
		obj.show(5.67f);
		obj.show(45);
	}

}
