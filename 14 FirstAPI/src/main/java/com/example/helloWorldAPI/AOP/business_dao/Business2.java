package com.example.helloWorldAPI.AOP.business_dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	@Autowired
	private Dao2 dao2;
	
	public String doSomething() {
		//business logic
		return dao2.retrieveSomething();
	}
}
