package com.example.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.databasedemo.entity.Person;
import com.example.databasedemo.jpa.PersonJPARepository;

@SpringBootApplication
public class DatabaseDemoApplicationJPA implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired 
	PersonJPARepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplicationJPA.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", repository.findAll());
		int id = 10001;
		logger.info("User with id {} -> {}",id, repository.findById(id));
		
		logger.info("Deleting user with id {}",id);
		repository.deleteById(id);
		logger.info("All users -> {}", repository.findAll());
		
		logger.info("Inserting new User -> {}", repository.insert(new Person("Henrique","VE",new Date())));

		logger.info("Update 10003 -> {}", 
				repository.update(new Person(10003,"Edmond","DE", new Date())));
		logger.info("All users -> {}", repository.findAll());

	}
}
