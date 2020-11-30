package com.mannir;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceA {

	private final static Logger LOGGER = LoggerFactory.getLogger(ServiceA.class);

	public static void main(String[] args) {
		SpringApplication.run(ServiceA.class, args);
		LOGGER.info("Mannir Springboot serviceA started successfully.");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
