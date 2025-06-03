package Javaworld;

public class Main12 {
    public static void main(String[] args) {
        int a = 10;
        changeValue(a);
        System.out.println("Value of x after method call: " + a); // Output: 10
    }

    static void changeValue(int a) {
        a = 20; // This only changes the local copy of 'a'
       System.out.println("Inside method: " + a); // Output: 20
    }
}

