package com.revature;

public class Starter {
	// instance variables
	private int id;
	private String firstName;
	private String lastName;

	// default constructor or No-Argument Constructor
	// default constructor will be added to the class by the JVM automatically if no
	// other constructor is defined in class
	public Starter() {
		id = 0;
		firstName = null;
		lastName = null;
	}

	// fully parameterized or All-Arg Constructor
	public Starter(int id, String firstName, String lastName /* local variables */) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public String toString() {
//		return "Starter = [ id = " + id + ", firstName =" + firstName + ", lastName =" + lastName + "]";
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starter obj1 = new Starter();
		Starter obj2 = new Starter(100, "abc", "xyz");
		
		Starter obj3 = new Starter();

		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		//Annonymous inner class 
		AbstractDemo absObj1 = new AbstractDemo() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//Extending anonymous class
		Demo1 absObj2 = new Demo1();
	}

}
