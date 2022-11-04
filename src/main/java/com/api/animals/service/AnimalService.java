package com.api.animals.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.animals.dao.AnimalDao;
import com.api.animals.request.AnimalRequest;

@Service
public class AnimalService {
	
	private static final Logger logger = LogManager.getLogger(AnimalService.class);
	
	@Autowired
	private AnimalDao dao;
	
	public boolean createAnimal (AnimalRequest request) {
		logger.info("AnimalService::request::" + request);
		return dao.createAnimal(request);
	}
	
}