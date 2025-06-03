package Javaworld;

public class Nestedif {

	public static void main(String[] args) {
		int age=14;
		boolean hasID=false;
		if(age>=18)
		{
			if(hasID)
			{
				System.out.println("you can enter");
			}
			else
			{
				System.out.println(" no idyou are not eligible");
			}
		}
		else {
			System.out.println("less age");
		}
	}

}