package com.revature;

public class EncapsulationDemo {
	
	private int a;
	int b;
	protected int c;
	public int d;
	
//	public EncapsulationDemo(int a) {
//		this.a=a;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj = new EncapsulationDemo();
		System.out.println(obj);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
