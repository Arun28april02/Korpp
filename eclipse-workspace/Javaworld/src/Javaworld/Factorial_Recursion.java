package Javaworld;

public class Factorial_Recursion {
	static int factorial(int n) {
		if (n==0) 
			return 1;
		else 
			return n * factorial (n-1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(factorial(6));
	}

}
