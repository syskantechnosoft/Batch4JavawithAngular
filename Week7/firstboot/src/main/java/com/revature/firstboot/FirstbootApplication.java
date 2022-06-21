package com.revature.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootApplication.class, args);
	}

	@GetMapping("/welcome") // This is Get End point (URI)
	public String welcome() {
		return "Welcome to Spring Boot";
	}

	@GetMapping("/hello") // This is another GET end point
	public String siva() {
		return "Hello World!!!";
	}

}
