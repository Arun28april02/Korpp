package Javaworld;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 0, 5, 1};  // Array to be sorted

        bubbleSort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap occurred, break early
            if (!swapped) {
                break;
            }
        }
    }
}
