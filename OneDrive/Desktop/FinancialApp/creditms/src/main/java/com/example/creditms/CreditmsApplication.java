package com.example.creditms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CreditmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditmsApplication.class, args);
	}

}
