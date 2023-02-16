package com.example.databasedemo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="person") //can be erased if it (table name) is the snake_case equivalent of the class name
@NamedQuery(name="find_all_persons",query="SELECT p FROM Person p")
public class Person {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name") //can be erased if it (table column) is the snake_case equivalent of the class name
	private String name;
	private String location;
	private Date birthDate;
	
	public Person(int id, String name, String location, Date birthDate) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	//added because with JPA and Hibernate auto adding sequence as id, id param is not longer necessary
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person() {
	}
}
