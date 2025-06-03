package Javaworld;

public class Rverse {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String reverse = " ";               

        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {       
            reverse += str.charAt(i);        
        }               

        // Print the reversed string
        System.out.println("Reversed String: " + reverse);
    }
}
