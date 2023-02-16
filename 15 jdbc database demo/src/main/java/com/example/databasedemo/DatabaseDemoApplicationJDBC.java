package com.example.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.databasedemo.entity.Person;
import com.example.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplicationJDBC implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired 
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplicationJDBC.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		int id = 10001;
		logger.info("User with id {} -> {}",id, dao.findById(id));
		
		logger.info("Deleting user with id {}",id,dao.deleteById(id));
		logger.info("All users -> {}", dao.findAll());
		
		logger.info("Inserting new User -> {}", dao.insert(new Person(10004,"Miguel","SP",new Date())));
		
		logger.info("Update 10003 -> {}", 
				dao.update(new Person(10003,"Edmond","DE", new Date())));
		logger.info("All users -> {}", dao.findAll());

	}
}
