package com.api.animals.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalsController {
	
	private Logger logger = LogManager.getLogger(AnimalsController.class);
	
	@GetMapping(value = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public Object getHealth() {
		logger.info("AnimalsController::getHealth::Executing");
		return "Animals Application is up!!";
	}
	
}