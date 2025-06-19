package exercise2;

import java.util.Random;
import java.util.Scanner;

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

	private static int binarySearch(int target, Integer[] array) {
		int arrayLength = array.length;
		int leftIndex = 0;
		int rightIndex = arrayLength - 1;
		while (leftIndex < rightIndex) {
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
