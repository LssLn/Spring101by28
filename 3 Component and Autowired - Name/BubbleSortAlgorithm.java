package com.example.demo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //wiring by primary has higher priority over wiring by name
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		//bubble sort logic
		return numbers;
	}
}
