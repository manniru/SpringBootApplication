package com.mannir;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceB {

	private final static Logger LOGGER = LoggerFactory.getLogger(ServiceB.class);

	public static void main(String[] args) {
		SpringApplication.run(ServiceB.class, args);
		LOGGER.info("Springboot ServiceB started successfully.");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
