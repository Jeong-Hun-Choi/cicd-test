package com.example.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdTestApplication {

	public static void main(String[] args) {
		System.out.println("CI/CD Test Application 시작9");
		
		SpringApplication.run(CicdTestApplication.class, args);
	}

}
//git config --global user.email "cjhcross2@daum.net"
//git clone https://github.com/Jeong-Hun-Choi/cicd-test.git