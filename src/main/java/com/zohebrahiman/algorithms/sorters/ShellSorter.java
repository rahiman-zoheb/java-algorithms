package com.zohebrahiman.algorithms.sorters;

import com.zohebrahiman.algorithms.helpers.SortHelper;

public class ShellSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {
		for (int increment = input.length / 2; increment >= 1; increment /= 2) {
			for (int start = 0; start < increment; start++) {
				sortByIncrement(input, start, increment);
			}
		}
		return input;
	}

	private void sortByIncrement(int[] input, int start, int increment) {
		for (int i = start; i < input.length; i = i + increment) {
			for (int j = Math.min(i + increment, input.length - 1); j - increment >= 0; j = j - increment) {
				if (input[j] < input[j - increment]) {
					SortHelper.swap(input, j, j - increment);
				} else {
					break;
				}
			}
		}
	}

}
