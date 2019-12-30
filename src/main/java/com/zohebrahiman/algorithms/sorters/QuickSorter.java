package com.zohebrahiman.algorithms.sorters;

import com.zohebrahiman.algorithms.helpers.SortHelper;

public class QuickSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {
		quickSort(input, 0, input.length - 1);
		return input;
	}

	private void quickSort(int[] input, int low, int high) {
		if (low >= high) {
			return;
		}

		int pivotIndex = partition(input, low, high);
		quickSort(input, low, pivotIndex - 1);
		quickSort(input, pivotIndex + 1, high);
	}

	private int partition(int[] input, int low, int high) {
		int pivot = input[low];
		int l = low, h = high;

		while (l < h) {
			while (input[l] <= pivot && l < h) {
				l++;
			}
			while (input[h] > pivot) {
				h--;
			}
			if (l < h) {
				SortHelper.swap(input, l, h);
			}
		}
		SortHelper.swap(input, low, h);

		return h;
	}

}
