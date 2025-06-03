package Javaworld;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 25, 30, 45, 50};
   
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Linear search logic
        boolean found = false;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) { 
                found = true;
                index = i;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

