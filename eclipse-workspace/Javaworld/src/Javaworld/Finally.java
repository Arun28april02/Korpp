package Javaworld;

public class Finally {

	public static void main(String[] args) {
      try {
    	  int a =20;
    	  int b =0;
    	  int i=a/b;
    	  System.out.println("the number i="+i);
      }catch(ArithmeticException e){
    	  System.out.println("the number is not divide by zero");
      }finally {
    	  System.out.println("exception handled");
      }
	}

}
