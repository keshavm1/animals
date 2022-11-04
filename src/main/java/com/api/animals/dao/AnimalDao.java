package com.api.animals.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.api.animals.request.AnimalRequest;

@Repository
public class AnimalDao {
	
	private static final Logger logger = LogManager.getLogger(AnimalDao.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean createAnimal (AnimalRequest request) {
		logger.info("AnimalDao::createAnimal::Executing");
		try {
			jdbcTemplate.update("insert into animal(name, can_walk, can_fly, can_sing) values (?,?,?,?)", new Object[] {request.getName(), request.isCanWalk(), request.isCanFly(), request.isCanSing()});
		} catch (Exception e) {
			logger.error("Error while performing database operation");
			return false;
		}
		return true;
	}
	
}
