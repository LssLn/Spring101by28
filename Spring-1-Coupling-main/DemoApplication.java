package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		BinarySearchImpl bS = new BinarySearchImpl(new BubbleSortAlgorithm());
		//bynarySearch has arg1 array, arg2 number to look for
		int result = bS.binarySearch(new int[] {2, 4, 6}, 3);
		System.out.println(result);
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
