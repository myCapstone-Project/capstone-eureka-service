package com.cricket.capstone_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class CapstoneEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneEurekaServiceApplication.class, args);
	}

}
