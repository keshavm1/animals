package com.api.animals.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.animals.request.AnimalRequest;
import com.api.animals.service.AnimalService;

@RestController
public class AnimalsController {
	
	private Logger logger = LogManager.getLogger(AnimalsController.class);
	
	@Autowired
	private AnimalService serv;
	
	@GetMapping(value = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public Object getHealth() {
		logger.info("AnimalsController::getHealth::Executing");
		return "Animals Application is up!!";
	}
	
	@PostMapping(value = "/animal", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public boolean createAnimal(@RequestBody AnimalRequest request) {
		logger.info("AnimalsController::createAnimal::Executing");
		return serv.createAnimal(request);
	}
	
}