package com.revature;

public class GarbageCollect1 {
	public static void main(String[] args) {
		Object o1 = new Object(); // 1
		Object o2 = new Object(); // 2
		Object o3 = o1;           // 3
		o2 = o3;     // 4
		
		System.gc();
	}
}
