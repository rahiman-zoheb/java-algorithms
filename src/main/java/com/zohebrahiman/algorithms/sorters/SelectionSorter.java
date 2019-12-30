package com.zohebrahiman.algorithms.sorters;

import com.zohebrahiman.algorithms.helpers.SortHelper;

public class SelectionSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex)
				SortHelper.swap(input, i, minIndex);
		}

		return input;
	}

}
