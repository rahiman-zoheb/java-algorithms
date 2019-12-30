package com.zohebrahiman.algorithms.sorters;

import java.util.Arrays;

import com.zohebrahiman.algorithms.heaps.Heap;
import com.zohebrahiman.algorithms.heaps.MaxHeap;

public class HeapSorter implements Sorter {

	@Override
	public int[] sort(int[] input) {
		Heap<Integer> heap = new MaxHeap<>(Integer.class, input.length);
		Integer[] array = Arrays.stream(input).boxed().toArray(Integer[]::new);
		heap.setArray(array);
		heap.heapify(input.length - 1);

		int endIndex = input.length - 1;
		while (endIndex > 0) {
			heap.swap(0, endIndex);
			endIndex--;
			heap.percolateDown(0, endIndex);
		}

		int[] sorted = Arrays.stream(heap.getArray()).mapToInt(Integer::intValue).toArray();
		return sorted;
	}

}
