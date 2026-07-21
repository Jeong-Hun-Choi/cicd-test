package com.example.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdTestApplication {

	public static void main(String[] args) {
		System.out.println("CI/CD Test Application 시작 21");
		
		SpringApplication.run(CicdTestApplication.class, args);
	}

}
