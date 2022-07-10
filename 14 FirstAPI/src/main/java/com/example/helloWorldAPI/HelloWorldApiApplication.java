package com.example.helloWorldAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.helloWorldAPI.AOP.business_dao.Business1;
import com.example.helloWorldAPI.AOP.business_dao.Business2;

@SpringBootApplication
public class HelloWorldApiApplication implements CommandLineRunner{
	@Autowired
	Business1 business1;
	@Autowired
	Business2 business2;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args){
		SpringApplication.run(HelloWorldApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(business1.doSomething());
		logger.info(business2.doSomething());
	}
}
