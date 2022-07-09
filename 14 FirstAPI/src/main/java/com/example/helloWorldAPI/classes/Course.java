package com.example.helloWorldAPI.classes;

import lombok.Data;

@Data
public class Course {
	private int id;
	private String name;
	private String author;
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
}
