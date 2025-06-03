package Javaworld;
import java.util.Stack;


public class StackExample1 {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the stack
        System.out.println("Stack elements: " + stack);

        // Peeking at the top element (without removal)
        System.out.println("Top element: " + stack.peek());

        // Popping an element (removes from the top)
        System.out.println("Popped element: " + stack.pop());

        // Displaying stack after pop
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element (returns position from top, or -1 if not found)
        System.out.println("Position of 10: " + stack.search(10));

        // Popping remaining elements
        stack.pop();
        stack.pop();
        
        // Checking stack after popping all elements
        System.out.println("Stack after clearing: " + stack);
        System.out.println("Is stack empty after clearing? " + stack.isEmpty());
    }
}
