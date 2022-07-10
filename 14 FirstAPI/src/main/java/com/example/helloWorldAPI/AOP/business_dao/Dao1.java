package com.example.helloWorldAPI.AOP.business_dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	public String retrieveSomething() {
		return "Dao1";
	}
}
