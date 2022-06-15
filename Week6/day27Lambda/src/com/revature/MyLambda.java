package com.revature;

public class MyLambda {

	// Normal Method [access modifier, return data type, function name, paranthesis
	// [normal brackets], function body is created using curly braces
	public void display() // --method signature
	{ // method body starts here
		System.out.println("This is display method!!!");
	} // method body ends here

	// lambdas are anonymous function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 ref = () -> System.out.println("This is lambda");
		ref.display();
	}

}
