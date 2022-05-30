package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
//	private SortAlgorithm quickSortAlgorithm; //wiring by name, has lower priority over primary
	private SortAlgorithm bubbleSortAlgorithm; //wiring by name
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.bubbleSortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearch) {
		int v = 0;
		
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

		return v;
	}
}
