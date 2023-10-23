package com.example.jakarta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class JakartaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JakartaApplication.class, args);
	}

}
