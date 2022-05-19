package com.revature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map cityMap = new HashMap();
		cityMap.put("Delhi", "India");
		cityMap.put("Chennai", "TamilNadu");
		cityMap.put("Hyderabad", "Telungana");
		cityMap.put("Bangalore", "Karnataka");

		System.out.println(cityMap);

		System.out.println("Method 2");
		Set keys = cityMap.keySet();
		for (Object object : keys) {
			System.out.println("Key is :" + object + " Value is :" + cityMap.get(object));
		}

	}
}
