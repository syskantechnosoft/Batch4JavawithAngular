package com.revature.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		String name="Hello World";// immutable - no modification to the original one
		StringBuffer buffer = new StringBuffer("Welcome to JAVA!!!");
		
		System.out.println(name+" "+buffer);
		
		name += buffer; //name = name+buffer; 
		buffer.append(name);
		
		System.out.println(name);
		System.out.println(buffer);
		
		String str = "my string";
		str.concat(" is the best!");
		System.out.println(str);
		
		StringBuilder str1 =new StringBuilder( "my string");
		str1.append(" is the best!");
		System.out.println(str1);
		
		
	}

}
