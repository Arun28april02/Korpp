package Javaworld;

public class ModifyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Java "); // Inserts "Java" at index 6
        sb.replace(6, 10, "Awesome"); // Replaces "Java" with "Awesome"
        sb.delete(5, 12); // Deletes " Awesome"
        sb.append(" java");
        sb.reverse();
        System.out.println(sb.toString()); // Output: Hello World
    }
}
