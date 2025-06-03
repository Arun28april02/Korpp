package Javaworld;

public class Exception {

	public static void main(String[] args) {
      try {
    	  int a =5/0;
    	  System.out.println("the num :"+a);
      } catch (ArithmeticException e) {
    	  System.out.println("Exception is handling");
      }
	}

}
