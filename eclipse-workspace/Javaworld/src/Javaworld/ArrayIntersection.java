package Javaworld;
//import java.util.HashSet;
import java.util.ArrayList;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4,};  // First array
        int[] arr2 = {3, 4, 5, 6};  // Second array

        // Create a list to store the intersection
        ArrayList<Integer> intersection = new ArrayList<>();
        // Loop through arr1
        for (int i = 0; i < arr1.length; i++) {
            // Loop through arr2
            for (int j = 0; j < arr2.length; j++) {
                // If element matches and is not already in intersection list
                if (arr1[
                         i] == arr2[j] && !intersection.contains(arr1[i])) {
                    intersection.add(arr1[i]);
                    break;  // Break inner loop once match is found
                }
            }
        }

        // Print the result
        System.out.println("Intersection: " + intersection);
    }
}
