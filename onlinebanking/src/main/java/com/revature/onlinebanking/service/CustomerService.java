package com.revature.onlinebanking.service;

import java.util.List;

import com.revature.onlinebanking.model.Customer;

public interface CustomerService {

	public List<Customer> getAll(); // Read All operation

	public Customer getById(int id); // Read by ID operation

	public void save(Customer customer);

	public void update(int id, Customer customer);

	public void deleteById(int id);

}
