package exercise3;

import java.util.Random;

/**
 * This class demonstrates sorting an array of integers using different sorting
 * algorithms. It currently implements Bubble Sort in descending order.
 */
public class Driver {

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main(String[] args) {

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for (int i = 0; i < SIZE; i++) {
			nums[i] = rand.nextInt(UPPER_BOUND);
		}
		System.out.println("Before sorting: \n" + arrayToString(nums) + "\n");

		if (args.length > 0) {
			char sortType = args[0].toLowerCase().charAt(0);
			switch (sortType) {

				case 'b':
					// BubbleSort implemented
					bubbleSortDescending(nums);
					break;
				case 'i':
					// Insertion sort not implemented
					break;
				case 's':
					// Selection sort not implemented
					break;
				case 'q':
					// Quick sort not implemented
					break;
				default:
					// Do nothing if no valid sort type is provided
					break;
			}
		}
		System.out.println("After sorting: \n" + arrayToString(nums) + "\n");
	}

	/**
	 * This method implements the Bubble Sort algorithm to sort an array of
	 * integers in descending order.
	 * 
	 * @param arr The array of integers to be sorted.
	 */
	public static void bubbleSortDescending(Integer[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Descending order
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * This method converts an array of integers to a string representation.
	 * 
	 * @param arr The array of integers to be converted.
	 * @return A string representation of the array.
	 */
	public static String arrayToString(Integer[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			sb.append(num).append(" ");
		}
		return sb.toString().trim();
	}

}
