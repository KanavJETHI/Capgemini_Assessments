package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class March14AssessmentEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(March14AssessmentEurekaServerApplication.class, args);
		System.out.println("Eureka Server started");
	}

}
