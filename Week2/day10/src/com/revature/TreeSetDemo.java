package com.revature;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set nameSet = new TreeSet();
		//interface reference holding implementation class Object
		nameSet.add("abc");
		nameSet.add("xyz");
//		nameSet.add(null);
		nameSet.add("bcd");
		nameSet.add("lmn");
//		nameSet.add(null);
		nameSet.add("ABC");
		
		System.out.println(nameSet);
	}

}
