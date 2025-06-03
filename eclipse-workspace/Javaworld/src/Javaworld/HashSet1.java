package Javaworld;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate won't be added

        System.out.println("HashSet after add(): " + fruits);

        // Checking existence
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Contains 'Grapes'? " + fruits.contains("Grapes"));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After remove('Banana'): " + fruits);

        // Getting size
        System.out.println("Size of HashSet: " + fruits.size());

        // Checking if empty
        System.out.println("Is HashSet empty? " + fruits.isEmpty());

        // Iterating using an iterator
        System.out.println("Iterating using iterator():");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Clearing the HashSet
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // Checking if empty after clear
        System.out.println("Is HashSet empty after clear()? " + fruits.isEmpty());
    }
}
