package com.revature;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map isdCodes = new HashMap();
		isdCodes.put(91, "India");
		isdCodes.put(1, "USA");
		isdCodes.put(94, "SriLanka");
		isdCodes.put(971, "UAE");
		isdCodes.put(65, "Singapore");
		isdCodes.put(94, "Pakistan");
		isdCodes.put(null, "USA");
		isdCodes.put(1, null);
		isdCodes.put(71, null);
		isdCodes.put(null, "Test");
		isdCodes.put(987, "India");
		
		System.out.println(isdCodes);
	}

}
