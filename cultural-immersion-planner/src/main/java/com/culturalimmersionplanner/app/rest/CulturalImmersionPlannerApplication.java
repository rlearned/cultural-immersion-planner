package com.culturalimmersionplanner.app.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CulturalImmersionPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CulturalImmersionPlannerApplication.class, args);
	}

}
