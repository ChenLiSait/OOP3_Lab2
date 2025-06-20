package exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 * This class generates an array of integers where each element is
 * the sum of the previous element and a random number.
 */
public class Driver {

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main(String[] args) {

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt(UPPER_BOUND);
		nums[0] = randnum;

		for (int i = 1; i < SIZE; i++) {
			randnum = rand.nextInt(UPPER_BOUND);
			nums[i] = nums[i - 1] + randnum;
			System.out.println(nums[i]);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a Integer: ");

		int target = scanner.nextInt();
		scanner.close();
		System.out.println("The index of target is: " + binarySearch(target, nums));
	}

	/**
	 * This method performs a binary search on a sorted array of integers.
	 * 
	 * @param target The integer to search for in the array.
	 * @param array  The sorted array of integers.
	 * @return The index of the target in the array, or -1 if not found.
	 */
	private static int binarySearch(int target, Integer[] array) {
		int arrayLength = array.length;
		int leftIndex = 0;
		int rightIndex = arrayLength - 1;
		while (leftIndex <= rightIndex) {
			int middleIndex = (leftIndex + rightIndex) / 2;
			if (array[middleIndex] == target) {
				return middleIndex;
			} else if (array[middleIndex] < target) {
				leftIndex = middleIndex + 1;
			} else {
				rightIndex = middleIndex - 1;
			}
		}
		return -1;
	}

}
