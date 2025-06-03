package Javaworld;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};  // Example array
        int N = 7;  // Expected maximum number

        // Calculate expected sum using formula
        int expectedSum = N * (N + 1) / 2;

        // Calculate actual sum using Java Streams (Optimized approach)
        int actualSum = Arrays.stream(arr).sum();

        // Compute the missing number
        int missingNumber = expectedSum - actualSum;

        // Display the result
        System.out.println("The missing number is: " + missingNumber);
    }
}
