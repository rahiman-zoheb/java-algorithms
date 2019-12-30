package com.zohebrahiman.algorithms.sorters;

import com.zohebrahiman.algorithms.helpers.SortHelper;

public class InsertionSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (input[j] < input[j - 1])
					SortHelper.swap(input, j, j - 1);
			}
		}

		return input;
	}

}
