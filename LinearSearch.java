import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target, index;
        int[] arr = { 5, 1, 6, 7, 2, 3, 8 };

        for (int i : arr) {
            System.out.print(i);
        }

        System.out.print("\nEnter the element to be search:");
        target = scanner.nextInt();
        index = LinearSearch.Linear(arr, target);

        System.out.println(target + " is at the index " + index);
        scanner.close();
    }

    public static int Linear(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }

}
