package Javaworld;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Inserting an element at a specific index
        fruits.add(1, "Mango");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Removing an element
        fruits.remove("Banana");

        // Checking size
        System.out.println("Size of Vector: " + fruits.size());

        // Iterating using for-each loop
        System.out.println("Iterating over Vector:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using traditional for loop
        System.out.println("Iterating using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

        // Checking if Vector contains a specific element
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        // Clearing all elements
        fruits.clear();
        System.out.println("After clear(), is Vector empty? " + fruits.isEmpty());
    }
}


