package com.zohebrahiman.algorithms.heaps;

import java.lang.reflect.Array;

@SuppressWarnings("rawtypes")
public abstract class Heap<T extends Comparable> {

	private static int MAX_SIZE = 100;
	private T[] array;
	private int count = 0;

	public Heap(Class<T> klass) {
		this(klass, MAX_SIZE);
	}

	@SuppressWarnings("unchecked")
	public Heap(Class<T> klass, int maxSize) {
		array = (T[]) Array.newInstance(klass, maxSize);
	}

	public void insert(T value) throws HeapFullException {
		if (isFull()) {
			throw new HeapFullException();
		}

		array[count] = value;
		siftUp(count);
		count++;
	}

	public T remove() throws HeapEmptyException {
		T result = peek();
		// Set root as the last element and sift down
		array[0] = array[count - 1];
		count--;
		siftDown(0);

		return result;
	}

	public T peek() throws HeapEmptyException {
		if (isEmpty()) {
			throw new HeapEmptyException();
		}
		return getElementAtIndex(0);
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count >= array.length;
	}

	public T getElementAtIndex(int index) {
		return array[index];
	}

	protected abstract void siftDown(int index);

	protected abstract void siftUp(int index);

	protected int getLeftChildIndex(int index) {
		int leftChildIndex = 2 * index + 1;
		leftChildIndex = leftChildIndex >= count ? -1 : leftChildIndex;
		return leftChildIndex;
	}

	protected int getRightChildIndex(int index) {
		int rightChildIndex = 2 * index + 2;
		rightChildIndex = rightChildIndex >= count ? -1 : rightChildIndex;
		return rightChildIndex;
	}

	protected int getParentIndex(int index) {
		if (index < 0 || index >= count) {
			return -1;
		}

		return (index - 1) / 2;
	}

	protected void swap(int j, int k) {
		T temp = array[j];
		array[j] = array[k];
		array[k] = temp;
	}

}
