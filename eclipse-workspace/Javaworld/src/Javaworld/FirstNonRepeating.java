package Javaworld;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count occurrences
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return 0; // Return null character if no unique character found
    }

    public static void main(String[] args) {
        String word = "swiss";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(word));
    }
}
