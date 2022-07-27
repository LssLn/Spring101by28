package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.cdi.SomeCDIBusiness;

@SpringBootApplication
public class DemoApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{} dao-{}",business, business.getSomeCDIDAO());	
	}
}
