package com.revature;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.revature.model.Employee;
import com.revature.model.Student;

public class MainClass {

	public static void main(String[] args) {
		// traditional way of creating objects

		Student stu1 = new Student(); // calling default constructor to create student object
		Student stu2 = new Student(100, "sample", "test"); // calling parameterized constructor to create student object

		System.out.println("stu1 :" + stu1);
		System.out.println("stu2 :" + stu2);

		// Creating objects using Spring
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Student stu3 = (Student) beanFactory.getBean("student1"); // type casting
		System.out.println("stu3 :" + stu3);

		Student stu4 = (Student) beanFactory.getBean("student2"); // type casting
		System.out.println("stu4 :" + stu4);

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Employee.class);
		Employee emp = (Employee) applicationContext.getBean("emp");
		System.out.println("emp :" + emp);
		
		Employee emp2 = (Employee) applicationContext.getBean("employee");
		System.out.println("emp2 :" +emp2);
	}

}
