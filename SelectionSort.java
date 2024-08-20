
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 9, 6, 2, 10, 2 };
        System.out.print("Unsorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] sorted = SelectionSort.Selection(arr);

        System.out.print("Sorted Array: ");
        for (int i : sorted) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] Selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
