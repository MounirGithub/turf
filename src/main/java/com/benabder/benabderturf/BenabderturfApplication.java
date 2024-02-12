package com.benabder.benabderturf;

import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.benabder.benabderturf"})
public class BenabderturfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenabderturfApplication.class, args);
	}
}
