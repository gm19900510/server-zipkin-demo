package com.gm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class ServiceMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMiyaApplication.class, args);
	}

	private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

	@RequestMapping("/hi")
	public String client_hi() {
		LOG.log(Level.INFO, "hi is being called");
		restTemplate.getForObject("http://localhost:8988/hi", String.class);
		return restTemplate.getForObject("http://localhost:8988/hi_two", String.class);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
