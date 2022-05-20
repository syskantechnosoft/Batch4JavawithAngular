package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.bean.User;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ageList = new ArrayList<Integer>();
		ageList.add(20);
		ageList.add(45);

		List<String> nameList = new ArrayList<String>();
		nameList.add("a");
		nameList.add("Hello");
		nameList.add("Welcome");
		
		
		//arraylist with custom Object
		List<User> userList = new ArrayList<User>();
		userList.add(new User(100, "ABC","abc@gmail.com", "abc123", "abc123", 8978672345l));
		User u1 = new User(101, "xyz", "xyz@gmail.com", "xyz123", "xyz123", 7867455667l);
		userList.add(u1);
		
	}

}
