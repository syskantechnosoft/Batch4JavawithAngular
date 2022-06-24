package com.revature.onlinebanking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.onlinebanking.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
