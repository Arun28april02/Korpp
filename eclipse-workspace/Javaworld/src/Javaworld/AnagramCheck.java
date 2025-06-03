package Javaworld;
import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String word1 = "listen", word2 = "silent";
        String w1 ="madam", w2 ="maadam";
        System.out.println("Anagram: " + isAnagram(word1, word2));
        System.out.println("Anagram: " +isAnagram(w1,w2));
    }
}
