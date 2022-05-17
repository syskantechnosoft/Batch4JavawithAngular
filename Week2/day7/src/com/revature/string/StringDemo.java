package com.revature.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring a primitive variable
		//data_type variable_name [= initial value];
		int a = 25; 
		String name = "ABC"; //This is String literal declaration 
		
		String city = new String("London"); // This is String object declaration
		
		String age = "35"; //This is also a string not a number
		
//		int a = 45;
		
		System.out.println(Integer.parseInt(age)+a); // output is 60
		
		
		System.out.println(name.charAt(2));
		
		System.out.println(age+a); //output is 3525
		
		System.out.println(city.indexOf('o',5));
		
		String city1 = "London"; //String literal
		String city2 = new String("London"); //String object
		String city3 = new String ("London1");
		
		System.out.println(city1==city2);
		System.out.println(city1.equals(city2));
		System.out.println(city1==city3);
		System.out.println(city1.equals(city3));
		
//		System.out.println(city1===city2);
		
		
		String str1 = "my string";
		str1.concat(" is the best!");
		System.out.println(str1);
		
		System.out.println(city1.hashCode());
		System.out.println(city2.hashCode());
		
	}

}
