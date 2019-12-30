package com.zohebrahiman.algorithms.sorters;

public class MergeSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {
		mergeSort(input);
		return input;
	}

	private void mergeSort(int[] input) {
		if (input.length == 1) {
			return;
		}

		int mid = input.length / 2 + input.length % 2;
		int[] left = new int[mid];
		int[] right = new int[input.length - mid];

		split(input, left, right);

		mergeSort(left);
		mergeSort(right);

		merge(input, left, right);
	}

	private void split(int[] input, int[] left, int[] right) {
		int i = 0;
		int rightStartIndex = left.length;

		for (int j = 0; j < input.length; j++) {
			// Copy the left half
			if (i < rightStartIndex) {
				left[i] = input[i];
			}
			// Copy the right half
			else {
				right[i - rightStartIndex] = input[i];
			}
			i++;
		}
	}

	private void merge(int[] output, int[] left, int[] right) {
		int mergeIndex, leftIndex, rightIndex;
		mergeIndex = leftIndex = rightIndex = 0;

		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] < right[rightIndex]) {
				output[mergeIndex++] = left[leftIndex++];
			} else {
				output[mergeIndex++] = right[rightIndex++];
			}
		}

		if (leftIndex < left.length) {
			while (leftIndex < left.length) {
				output[mergeIndex++] = left[leftIndex++];
			}
		}
		if (rightIndex < right.length) {
			while (rightIndex < right.length) {
				output[mergeIndex++] = right[rightIndex++];
			}
		}
	}
}
