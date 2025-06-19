package exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2, 0, 100, 20, 17, 88, 22, 43, 66};

        System.out.println("Before sorting: " + arrayToString(numbers));

        if (args.length > 0) {
            char sortType = args[0].toLowerCase().charAt(0);
            switch (sortType) {
            	
                case 'b':
                	// BubbleSort implemented
                    bubbleSortDescending(numbers);
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
                    // Do nothing
                    break;
            }
        }

        System.out.println("After sorting: " + arrayToString(numbers));
    }

    public static void bubbleSortDescending(int[] arr) {
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

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}

