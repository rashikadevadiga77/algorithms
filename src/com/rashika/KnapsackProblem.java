package com.rashika;

/**
 * 
 * @author Rashika Knapsack Problem: Wikipedia explanation: Given a set of
 *         items, each with a weight and a value, determine the number of each
 *         item to include in a collection so that the total weight is less than
 *         or equal to a given limit and the total value is as large as
 *         possible. Reference: Tushar Roy videos on Youtube
 */
public class KnapsackProblem {
	public static void main(String[] args) {
		int[] weights = { 1, 3, 4, 5 };
		int[] values = { 1, 4, 5, 7 };
		int maxWeight = 7;

		System.out.println("Max weight: "
				+ getMaximumProfit(weights, values, maxWeight));
	}

	private static int getMaximumProfit(int[] weights, int values[],
			int maxWeight) {
		// Matrix. Number of rows = number of items. Number of columns =
		// maxWeight.
		int knapsack[][] = new int[weights.length + 1][maxWeight + 1];
		for (int i = 0; i <= weights.length; i++) {
			for (int j = 0; j <= maxWeight; j++) {
				if (i == 0 || j == 0) {
					knapsack[i][j] = 0;
				} else if (j < weights[i - 1]) {
					knapsack[i][j] = knapsack[i - 1][j];
				} else {
					knapsack[i][j] = Math.max(values[i - 1]
							+ knapsack[i - 1][j - weights[i - 1]],
							knapsack[i - 1][j]);
				}
			}
		}
		return knapsack[weights.length - 1][maxWeight];

	}

}
