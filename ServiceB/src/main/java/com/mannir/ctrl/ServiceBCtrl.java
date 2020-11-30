package com.mannir.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/serviceb")
public class ServiceBCtrl {

	private final static Logger LOGGER = LoggerFactory.getLogger(ServiceBCtrl.class);

	@Autowired
	RestTemplate restTemplate;

	@GetMapping
	public String welcome() {
		LOGGER.info("Inside ServiceB welcome() method and returning response for the requested resource.");
		return "Hello world from Mannir SpringBoot Application ServiceB";
	}
}
