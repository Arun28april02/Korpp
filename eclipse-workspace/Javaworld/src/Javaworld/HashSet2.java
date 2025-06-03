package Javaworld;
import java.util.HashSet;


public class HashSet2 {
    public static void main(String[] args) {

        // Create first HashSet
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        System.out.println("Set 1: " + set1);

        // Create second HashSet
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Date");

        System.out.println("Set 2: " + set2);

        // Perform set operations

        // 1. Union (addAll)
        HashSet<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("\nUnion (set1 ∪ set2): " + unionSet);

        // 2. Difference (removeAll)
        HashSet<String> diffSet = new HashSet<>(set1);
        diffSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + diffSet);

        // 3. Intersection (retainAll)
        HashSet<String> interSet = new HashSet<>(set1);
        interSet.retainAll(set2);
        System.out.println("Intersection (set1 ∩ set2): " + interSet);
    }
}
