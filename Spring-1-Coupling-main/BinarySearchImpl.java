package com.example.demo;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearch) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		return 1;
	}
}
