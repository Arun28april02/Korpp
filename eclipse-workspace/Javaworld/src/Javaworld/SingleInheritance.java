package Javaworld;
 class Parent{
	 void m1() {
		 System.out.println("Parent ");
	 }
 }
 class Child extends Parent{
	 void m2() {
		 System.out.println("Child");
	 }
 }
public class SingleInheritance {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.m1();
		c1.m2();

	}

}
