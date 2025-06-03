package Javaworld;

public class AllExceptions {

	public static void main(String[] args) {
      try {
    	  int a[]= {10,20,30,40};
    	  System.out.println("the num is ="+a[5]);
      }catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("The Exception is Handling");
      }
	}

}
