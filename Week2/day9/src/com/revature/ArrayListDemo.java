package com.revature;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ageList = new ArrayList();
		ageList.add(25);
		ageList.add(28);
		ageList.add(21);
		ageList.add(27);
		ageList.add(23);
		ageList.add(25);
		ageList.add(31);
		ageList.add(38);
		
		int age= 34;
		
		//Autoboxing will happen
		//converting primitive to it's corresponding object
		ageList.add(age);
		
		
		System.out.println("Printing Collections");
		System.out.println("Method 1: Printing the entire collection as it is");
		System.out.println(ageList);
		
		System.out.println("Method 2: Printing each element of the collection individually using enhanced for loop");
		for (Object object : ageList) {
			System.out.println(object);	
		}
		System.out.println("Method 3: Printing each element of the collection individually using normal for loop");
		for (int i=0;i<ageList.size();i++)
			System.out.println(ageList.get(i));
		
		System.out.println("Method 4: Printing each element of the collection individually using iterator");
		Iterator itr = ageList.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
