package Javaworld;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {
    // Declares that this method may throw IOException
    public static void readFile() throws IOException {
        try (FileReader fr = new FileReader("hello.txt");
             BufferedReader br = new BufferedReader(fr)) {

            System.out.println("File contents:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        try {
            readFile(); // Exception handled here
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
