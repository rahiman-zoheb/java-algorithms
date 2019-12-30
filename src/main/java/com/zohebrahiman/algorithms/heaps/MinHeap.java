package com.zohebrahiman.algorithms.heaps;

@SuppressWarnings("rawtypes")
public class MinHeap<T extends Comparable> extends Heap<T> {

	public MinHeap(Class<T> klass) {
		super(klass);
	}

	public MinHeap(Class<T> klass, int maxSize) {
		super(klass, maxSize);
	}

	@Override
	protected void siftDown(int index) {
		int leftIndex = getLeftChildIndex(index);
		int rightIndex = getRightChildIndex(index);

		int smallerIndex = -1;

		if (leftIndex != -1 && rightIndex != -1) {
			smallerIndex = getElementAtIndex(leftIndex).compareTo(getElementAtIndex(rightIndex)) < 0 ? leftIndex
					: rightIndex;
		} else if (leftIndex != -1) {
			smallerIndex = leftIndex;
		} else if (rightIndex != -1) {
			smallerIndex = rightIndex;
		}

		if (smallerIndex == -1) {
			return;
		}

		// If current element is greater than element at smaller index, swap and sift
		// down
		if (getElementAtIndex(index).compareTo(getElementAtIndex(smallerIndex)) > 0) {
			swap(index, smallerIndex);
			siftDown(smallerIndex);
		}
	}

	@Override
	protected void siftUp(int index) {
		if (index == -1) {
			return;
		}

		int parentIndex = getParentIndex(index);
		// If current element is lesser than parent element, swap and sift up
		if (parentIndex != -1 && getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) < 0) {
			swap(index, parentIndex);
			siftUp(parentIndex);
		}

	}

}
