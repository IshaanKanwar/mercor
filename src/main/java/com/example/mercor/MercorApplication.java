package com.example.mercor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MercorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercorApplication.class, args);
	}

}
