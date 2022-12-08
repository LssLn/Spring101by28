package com.example.databasedemo.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Person {
	private int id;
	private String name;
	private String location;
	private Date birthDate;
}
