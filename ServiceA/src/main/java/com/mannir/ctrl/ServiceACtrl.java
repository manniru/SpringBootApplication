package com.mannir.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/servicea")
public class ServiceACtrl {

	private final static Logger LOGGER = LoggerFactory.getLogger(ServiceACtrl.class);

	@Autowired
	RestTemplate restTemplate;

	// Resource URL - http://localhost:10091/servicea
	@GetMapping
	public String welcome() {
		LOGGER.info("Inside servicea welcome() method.");

		final String microservice2Url = "http://serviceb:10092/serviceb";
		final String response = (String) restTemplate.exchange(microservice2Url, HttpMethod.GET, null, String.class).getBody();

		LOGGER.info("The response received from serviceb= " + response);
		return response;
	}
}
