package com.zohebrahiman.algorithms.helpers;

public class SortHelper {

	public static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
