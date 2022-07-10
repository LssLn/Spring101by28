package com.example.helloWorldAPI.AOP.business_dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
	@Autowired
	private Dao1 dao1;
	
	public String doSomething() {
		//business logic
		return dao1.retrieveSomething();
	}
}
