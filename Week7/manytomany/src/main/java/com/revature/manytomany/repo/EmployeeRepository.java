package com.revature.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.manytomany.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
