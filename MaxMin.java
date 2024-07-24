package hackerrank;

import java.util.*;

public class MaxMin {

	private static int maxMin(int k, List<Integer> arr) {

		Collections.sort(arr);

		int size = arr.size();

		int unfairness = Integer.MAX_VALUE;

		for (int i = 0; i < size - k + 1; i++) {
			unfairness = Math.min(arr.get(i + k - 1) - arr.get(i), unfairness);
		}

		return unfairness;
	}

	public static void main(String[] args) {

		int k = 2;

		Integer[] array = { 1, 4, 7, 2 };
		List<Integer> arr = Arrays.asList(array);

		int result = maxMin(k, arr);

		System.out.println("\n" + result);
	}

}
