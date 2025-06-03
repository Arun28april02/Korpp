package Javaworld;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        // Creating a HashMap to store student names and their marks
        HashMap<String, Integer> studentMarks = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        studentMarks.put("Alice",85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("Alice", 90); // Overwrites the previous value for "Alice"

        // Printing the HashMap
        System.out.println("Student Marks: " + studentMarks);

        // Fetching a specific value
        System.out.println("Marks of Bob: " + studentMarks.get("Bob"));

        // Checking if a key exists
        System.out.println("Contains 'Charlie'? " + studentMarks.containsKey("Charlie"));
        System.out.println("Contains 'Dave'? " + studentMarks.containsKey("Dave"));

        // Removing an entry
        studentMarks.remove("Charlie");
        System.out.println("After removing Charlie: " + studentMarks);

        // Iterating through the HashMap using entrySet()
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Checking if HashMap is empty
        System.out.println("Is HashMap empty? " + studentMarks.isEmpty());

        // Getting the size
        System.out.println("Size of HashMap: " + studentMarks.size());
    }
}
