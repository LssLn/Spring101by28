package com.example.helloWorldAPI.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloWorldAPI.classes.Course;

@RestController
public class CourseController {
	/*
		// http://localhost:8080/courses
		
		[
		  {
		    "id": 1,
		    "name": "BioTechnologies",
		    "author": "Edgar Munich"
		  }
		]
	 */
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"BioTechnologies","Edgar Munich"));
	}
	@GetMapping("/hello")
	public String getHello() {
		return "Hi! welcome to the world! :)";
	}
	
	/*
	 * http://localhost:8080/actuator
	 * http://localhost:8080/actuator/$
	 * */
}
