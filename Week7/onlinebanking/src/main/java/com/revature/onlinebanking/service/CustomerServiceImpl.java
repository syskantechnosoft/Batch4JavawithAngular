package com.revature.onlinebanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.onlinebanking.model.Customer;
import com.revature.onlinebanking.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return customerRepository.getReferenceById(id);
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);

	}

	@Override
	public void update(int id, Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

}
