package com.api.animals;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.api.animals")
public class AnimalsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Empty method
	}

}
