package Javaworld;
public class String_Permutations {

    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result); // ← This is where printing happens
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                permute(remaining, result + ch); // ← This is the recursive call
            }
        }
    }

    public static void main(String[] args) {
        permute("abc", ""); // ← First call to start the process
    }
}
