package com.zohebrahiman.algorithms.heaps;

@SuppressWarnings("rawtypes")
public class MaxHeap<T extends Comparable> extends Heap<T> {

	public MaxHeap(Class<T> klass) {
		super(klass);
	}

	public MaxHeap(Class<T> klass, int maxSize) {
		super(klass, maxSize);
	}

	@Override
	protected void siftDown(int index) {
		int leftIndex = getLeftChildIndex(index);
		int rightIndex = getRightChildIndex(index);

		int largerIndex = -1;

		if (leftIndex != -1 && rightIndex != -1) {
			largerIndex = getElementAtIndex(leftIndex).compareTo(getElementAtIndex(rightIndex)) > 0 ? leftIndex
					: rightIndex;
		} else if (leftIndex != -1) {
			largerIndex = leftIndex;
		} else if (rightIndex != -1) {
			largerIndex = rightIndex;
		}

		if (largerIndex == -1) {
			return;
		}

		// If current element is lesser than element at larger index, swap and sift down
		if (getElementAtIndex(index).compareTo(getElementAtIndex(largerIndex)) < 0) {
			swap(index, largerIndex);
			siftDown(largerIndex);
		}
	}

	@Override
	protected void siftUp(int index) {
		if (index == -1) {
			return;
		}

		int parentIndex = getParentIndex(index);
		// If current element is greater than parent element, swap and sift up
		if (parentIndex != -1 && getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) > 0) {
			swap(index, parentIndex);
			siftUp(parentIndex);
		}

	}

}
