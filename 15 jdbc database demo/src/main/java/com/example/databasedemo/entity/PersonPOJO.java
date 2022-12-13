package com.example.databasedemo.entity;

import java.util.Date;

import lombok.Data;

@Data
public class PersonPOJO {
	private int id;
	private String name;
	private String location;
	private Date birthDate;
	
	public PersonPOJO(int id, String name, String location, Date birthDate) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public PersonPOJO() {
	}
}
