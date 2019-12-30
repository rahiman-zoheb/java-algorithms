package com.zohebrahiman.algorithms.testers;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

import com.zohebrahiman.algorithms.sorters.BubbleSorter;
import com.zohebrahiman.algorithms.sorters.HeapSorter;
import com.zohebrahiman.algorithms.sorters.InsertionSorter;
import com.zohebrahiman.algorithms.sorters.MergeSorter;
import com.zohebrahiman.algorithms.sorters.QuickSorter;
import com.zohebrahiman.algorithms.sorters.SelectionSorter;
import com.zohebrahiman.algorithms.sorters.ShellSorter;
import com.zohebrahiman.algorithms.sorters.Sorter;

public class SortTester {

	private static final int SIZE_OF_TEST_ARRAYS = 10000;

	public static void main(String... args) {
		test(new SelectionSorter());
		test(new BubbleSorter());
		test(new InsertionSorter());
		test(new ShellSorter());
		test(new MergeSorter());
		test(new QuickSorter());
		test(new HeapSorter());
	}

	protected static Duration test(Sorter sorter) {
		int[] input = createIntegerArray();
		int[] correct = Arrays.copyOf(input, input.length);
		Arrays.sort(correct);

		Instant start = Instant.now();
		int[] sorted = sorter.sort(input);
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);
		if (verify(sorted, correct)) {
			System.out.format("Success sorting using %s in  %02d minutes %02d seconds %04d millis \n",
					sorter.getClass().getSimpleName(), duration.toMinutes(), duration.getSeconds(),
					duration.toMillis());
		} else {
			System.out.format("Failure sorting using %s! Sorted Array: %s  Correct Array: %s",
					sorter.getClass().getSimpleName(), Arrays.toString(sorted), Arrays.toString(correct));
		}
		return duration;
	}

	private static boolean verify(int[] input, int[] correct) {
		return Arrays.equals(input, correct);
	}

	private static int[] createIntegerArray() {
		Random rd = new Random();
		int[] input = new int[SIZE_OF_TEST_ARRAYS];
		for (int i = 0; i < input.length; i++) {
			input[i] = rd.nextInt();
		}
		return input;
	}

}
