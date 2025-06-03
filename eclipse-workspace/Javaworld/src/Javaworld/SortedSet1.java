package Javaworld;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		SortedSet<String> fruits = new TreeSet<>();

	   fruits.add("Apple");
	   fruits.add("Banana");
	   fruits.add("Cherry");
	   fruits.add("Banana");
	  System.out.println("Fruits  :"+fruits); 
	}

}
