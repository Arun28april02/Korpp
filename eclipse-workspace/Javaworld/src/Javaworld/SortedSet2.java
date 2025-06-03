package Javaworld;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SortedSet <Integer> numbers=new TreeSet<>();
      numbers.add(10);
      numbers.add(5);
      numbers.add(20);
      numbers.add(25);
      numbers.add(30);
      
      System.out.println("SortedSet Numbers :"+numbers);
      System.out.println("First :"+numbers.first());
      System.out.println("Last  :"+numbers.last());
      numbers.remove(20);
      System.out.println("SortedSet Numbers :"+numbers);
	}

}
