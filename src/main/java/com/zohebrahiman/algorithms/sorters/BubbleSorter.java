package com.zohebrahiman.algorithms.sorters;

import com.zohebrahiman.algorithms.helpers.SortHelper;

public class BubbleSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean swapFlag = false;
			for (int j = input.length - 1; j > i; j--) {
				if (input[j] < input[j - 1]) {
					SortHelper.swap(input, j, j - 1);
					swapFlag = true;
				}
			}
			if (!swapFlag) {
				return input;
			}
		}

		return input;
	}

}
