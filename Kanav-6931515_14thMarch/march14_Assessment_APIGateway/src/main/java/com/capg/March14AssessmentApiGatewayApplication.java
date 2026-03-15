package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class March14AssessmentApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(March14AssessmentApiGatewayApplication.class, args);
		System.out.println("API gateway service started");
	}

}
