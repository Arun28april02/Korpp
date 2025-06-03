package Javaworld;

public class Fibonacci_Recurssion {

    // Recursive function to return nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10; // Print first 10 Fibonacci numbers
        System.out.println("Fibonacci series using recursion:");

        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
