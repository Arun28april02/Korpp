package Javaworld;
import java.util.Scanner;

public class Aboutme {

	public static void main(String[] args) {
       Scanner a= new Scanner(System.in);
       System.out.println("Enter name  :");
       String name=a.next();
       a.nextLine();
       System.out.println("your name is :"+name);
       
       System.out.println("College  :");
       String college= a.nextLine();
       System.out.println("Your College Name :"+college);
       
       System.out.println("Branch  :");
       String branch=a.nextLine();
       System.out.println("Your Branch  :"+branch);
       
       System.out.println("CGPA  :");
       float CGPA=a.nextFloat();
       System.out.println("The CGPA  :"+CGPA);
       
       System.out.println("Enter age :");
       int age=a.nextInt();
       System.out.println("Your Age  :"+age);
       
       System.out.println("The Exp  :");
       int exp=a.nextInt();
       System.out.println("TotalExp  :"+exp);
       
       System.out.println("Hobbies :");
       String hobbies=a.next();
       System.out.println("Hobbies  :"+hobbies);
       a.close();
	}

}
