package com.revature.onlinebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.onlinebanking.model.Customer;
import com.revature.onlinebanking.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to OnlineBanking";
	}

	@GetMapping("/welcome1")
	public String welcome1() {
		return "Welcome to OnlineBanking1";
	}

	@GetMapping("/data/customer")
	public List<Customer> getCustomers() {
		return customerService.getAll();
	}

	@GetMapping("/data/customer/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getById(id);
	}

	@PostMapping("/data/customer")
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.save(customer);
	}

	@PutMapping("/data/customer/{id}")
	public void updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
		customerService.save(customer);
	}

	@DeleteMapping("/data/customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteById(id);
	}
}
