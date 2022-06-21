package com.revature;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.revature.model.Student;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Student student = (Student) factory.getBean("studentbean");
		System.out.println(student);
	}

}
