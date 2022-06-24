package com.revature.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.revature.manytomany.model.Employee;
import com.revature.manytomany.model.Project;
import com.revature.manytomany.repo.EmployeeRepository;

@SpringBootApplication
@EnableJpaAuditing
public class ManytomanyApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		// Create an employee
		Employee employee = new Employee();
		employee.setFirstName("Sivakumar");
		employee.setLastName("OS");

		// Create project1
		Project project = new Project();
		project.setTitle("Online Banking");

		// Create project2
		Project project1 = new Project();
		project1.setTitle("Food4Delivery");

		// employee can work on two projects, Add project references in the employee
		employee.getProjects().add(project);
		employee.getProjects().add(project1);

		// Add employee reference in the projects
		project.getEmployees().add(employee);
		project1.getEmployees().add(employee);

		employeeRepository.save(employee);
	}

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

}
