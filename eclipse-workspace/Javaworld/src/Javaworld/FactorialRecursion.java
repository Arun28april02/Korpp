package Javaworld;

public class FactorialRecursion {
    public static long factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
