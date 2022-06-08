package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl bS = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bS2 = applicationContext.getBean(BinarySearchImpl.class);
//		BinarySearchImpl bS = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//same hashCode if BinarySearchImpl bean scope is Singleton, different if it is Prototype
		System.out.println(bS);
		System.out.println(bS2); 
		
		int result = bS.binarySearch(new int[] {2, 4, 6}, 3);
	}

}
