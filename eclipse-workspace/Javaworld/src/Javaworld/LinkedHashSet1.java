package Javaworld;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); // Duplicate, will not be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet contents: " + set);
    }
}
