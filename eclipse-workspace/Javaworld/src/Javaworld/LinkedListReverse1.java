package Javaworld;
import java.util.LinkedList;



public class LinkedListReverse1 {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        // Print in reverse using logic and index
        System.out.print("Reversed List: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
