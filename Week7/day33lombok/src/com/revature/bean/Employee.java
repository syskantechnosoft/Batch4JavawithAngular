package com.revature.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lombok annotation which will add getters, setters, equals, hashcode &
		// toString method with default constructor (Class level annotation)
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String address;

	// we manually add getters & setters

}
