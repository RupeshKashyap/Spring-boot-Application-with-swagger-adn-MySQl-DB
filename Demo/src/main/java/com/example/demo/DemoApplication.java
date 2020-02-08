package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.ControllerStudent;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {
	private static final Logger logger = LogManager.getLogger(ControllerStudent.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.debug("Rest controller executing");
		logger.debug("Debugging log in our greeting method");
		logger.info("Info log in our greeting method");
		logger.warn("Warning log in our greeting method");
		logger.error("Error in our greeting method");
		logger.fatal("Damn! Fatal error. Please fix me.");
		System.out.println("Application started");
	}
	
//	http://localhost:9090/v2/api-docs
//	 http://localhost:8080/swagger-ui.html,

}
