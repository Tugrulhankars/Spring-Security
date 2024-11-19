package com.example.spring_security_medium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.spring_security_medium")
@ComponentScan(basePackages = "com.example.spring_security_medium")
public class SpringSecurityMediumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityMediumApplication.class, args);
	}

}
