import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int target, index;
		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int i : arr) {
			System.out.print(i);
		}
		
		System.out.print("\nEnter the element to be search: ");
		target = scanner.nextInt();
		
		index = BinarySearch.Binary(arr, target);
		System.out.println("Element is at the index: " + index);
		scanner.close();
	}

	public static int Binary(int[] arr, int target) {
		int low, high, middle;
		low = 0;
		high = arr.length - 1;

		while (low <= high) {
			middle = (low + high) / 2;
			if (target > arr[middle]) {
				low = middle + 1;
			} else if (target < arr[middle]) {
				high = middle - 1;
			} else {
				return middle;
			}
		}
		
		return -1;
	}
}
