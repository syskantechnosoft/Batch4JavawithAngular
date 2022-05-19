package com.revature;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List nameList = new ArrayList();
		nameList.add("Name1");
		nameList.add("Name2");
		nameList.add("Name4");
		nameList.add("Name5");
		nameList.add("Name3");
		nameList.add("Name1");
		
		System.out.println(nameList);
		//Arraylist is dynamically growable- It size can be changed at runtime
		
		System.out.println(nameList.size());
		nameList.add("Name4");
		nameList.add("Name5");
		nameList.add("Name3");
		nameList.add("Name1");
		
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		
		System.out.println(nameList.get(1));
		
		System.out.println(nameList.contains("name5"));
	}

}
