package com.run.distanceCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient 
@EnableJpaRepositories(basePackages= {"com.repo"})
@EntityScan(basePackages= {"com.model"})
@ComponentScan(basePackages= {"com.controller","com.service"})
public class DistanceCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistanceCalculatorApplication.class, args);
	}

}
