package com.rashika.array;

/**
 * 
 * @author Rashika
 * 
 */
public class SumInContiguousSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		findSum(input, 23);
	}

	private static void findSum(int[] input, int sum) {
		if (input == null || input.length == 0) {
			return;
		}
		int currSum = input[0];
		int start = 0;
		for (int i = 1; i < input.length + 1; i++) {
			while (currSum > sum && start < i) {
				currSum = currSum - input[start];
				start++;
			}

			if (currSum == sum) {
				System.out.println("Found sum: " + start + " to " + (i - 1));
				break;
			}
			
			if(i < input.length){
				currSum = currSum + input[i];
			}
		}
	}

}
