package Javaworld;


import java.util.HashMap;

public class DuplicateUniqueArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 6};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print duplicates and unique elements
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                System.out.println("Duplicate: " + num);
            } else {
                System.out.println("Unique: " + num);
            }
        }
    }
}

