package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
@SpringBootApplication(exclude =
org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext jsp = SpringApplication.run(DemoApplication.class, args);
		for(String s: jsp.getBeanDefinitionNames())
		{
	System.out.println(s);
		}
	}

}
