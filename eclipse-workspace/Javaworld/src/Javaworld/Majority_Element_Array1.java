package Javaworld;

public class Majority_Element_Array1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3, 1, 2}; 
        int n = arr.length; // 7
        int majorityElement = -1;

        for (int i = 0; i < n; i++) { 
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) { 
                    count++;
                }
            }

            if (count > n / 2) {
                majorityElement = arr[i];
                break; // Exit loop as majority element is found
            }
        }

        if (majorityElement != -1) {
            System.out.println("Majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
