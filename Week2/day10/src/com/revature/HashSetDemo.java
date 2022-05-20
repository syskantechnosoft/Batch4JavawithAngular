package com.revature;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set nameSet = new HashSet();
		nameSet.add("abc");
		nameSet.add("xyz");
		nameSet.add(null);
		nameSet.add("bcd");
		nameSet.add("lmn");
		nameSet.add(null);
		
		System.out.println(nameSet);
		
	}

}
