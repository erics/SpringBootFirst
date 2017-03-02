package com.monster.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationDemo {
	public static void main(String[] args) {
		System.out.println("springApplication run!");
		SpringApplication.run(ApplicationDemo.class, args);
	}
}
