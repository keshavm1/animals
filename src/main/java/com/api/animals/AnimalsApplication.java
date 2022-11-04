package com.api.animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AnimalsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Empty method
	}

}
