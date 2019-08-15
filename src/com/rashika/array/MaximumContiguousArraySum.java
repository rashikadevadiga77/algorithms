package com.rashika.array;

/**
 * 
 * @author Rashika Also known as Kadane's Algorithm
 * 
 */
public class MaximumContiguousArraySum {
	public static void main(String[] args) {
		int[] input = { -1, 4, -3, 7, -6 };
		System.out.println("Maximum sum: " + findMaximumSum(input));
	}

	private static int findMaximumSum(int[] input) {
		if (input == null || input.length == 0) {
			return 0;
		}
		int currSum = input[0];
		int maxSum = input[0];
		for (int i = 1; i < input.length; i++) {
			currSum = Math.max(input[i] + currSum, input[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
}
