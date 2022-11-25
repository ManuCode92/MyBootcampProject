package com.bootcamp.MYBOOTCAPPROJECT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MybootcapprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybootcapprojectApplication.class, args);
		System.out.println("Arranca el server");
	}

}
