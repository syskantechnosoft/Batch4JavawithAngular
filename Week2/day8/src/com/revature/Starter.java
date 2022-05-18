package com.revature;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		
		MyInterface obj1 = new MyInterface() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Class1 obj2 = new Class1();
		obj2.show();
		
		MyAbstract obj3 = new MyAbstract() {};
		obj3.show();
		obj3.display();
		
		AnotherInterface.output();
	}

}
