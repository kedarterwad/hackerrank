package hackerrank;

import java.util.Arrays;

public class GreedyFlorist {

	private static int greedyFlorist(int numberOfPeople, int[] flowerPrices) {

		int numberOfPrices = flowerPrices.length;
		int totalPrice = 0;

		Arrays.sort(flowerPrices);

		for (int i = 0; i < numberOfPrices; i++) {
			totalPrice += ((i / numberOfPeople) + 1) * flowerPrices[numberOfPrices - 1 - i];
		}

		return totalPrice;
	}

	public static void main(String[] args) {

		int[] flowerPrices = { 9, 3, 5, 7, 1 };

		for (int num : flowerPrices) {
			System.out.print(num + " ");
		}

		int numberOfPeople = 3;

		System.out.println("\n" + numberOfPeople);

		System.out.println("\n" + greedyFlorist(numberOfPeople, flowerPrices));
	}
}
