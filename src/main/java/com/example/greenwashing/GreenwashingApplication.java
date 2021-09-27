package com.example.greenwashing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.greenwashing.*")
@EntityScan(basePackages = "greenwashing")
@ComponentScan("com.example.greenwashing.model")
@SpringBootApplication
public class GreenwashingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenwashingApplication.class, args);
	}

}
