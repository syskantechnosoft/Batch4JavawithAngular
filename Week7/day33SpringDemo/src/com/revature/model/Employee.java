package com.revature.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component("emp")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;

	@Bean(name = "employee")
	public Employee getEmployee() {
		return new Employee(200,"test");
	}

}
