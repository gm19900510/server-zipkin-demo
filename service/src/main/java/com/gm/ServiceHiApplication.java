package com.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class ServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());

	@RequestMapping("/hi")
	public String service_hi() {
		LOG.log(Level.INFO, "calling trace hi");
		return "Hello World";
	}

	@RequestMapping("/hi_two")
	public String service_hi_two() {
		LOG.log(Level.INFO, "calling trace hi");
		return "Hello World";
	}

}
