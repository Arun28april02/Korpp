package Javaworld;
import java.util.ArrayList;  // Import statement for ArrayList

public class Arraylist {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Accessing elements using index
        System.out.println("Element at index 2: " + fruits.get(2));  // Cherry

        // Iterating through the ArrayList
        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove(1);  // Removes "Banana"
        System.out.println("After removing Banana: " + fruits);

        // Checking size
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Checking if ArrayList contains an element
        System.out.println("Does the list contain Mango? " + fruits.contains("Mango"));

        // Clearing all elements
        fruits.clear();
        System.out.println("Is the list empty? " + fruits.isEmpty());
    }
}
