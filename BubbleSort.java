public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 1, 8, 6 };
        System.out.print("Unsorted Array:\t");
        for (int i : arr) {
            System.out.print(i);
        }
        Bubble(arr);
    }

    public static void Bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\n");
        System.out.print("Sorted Array:\t");
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
