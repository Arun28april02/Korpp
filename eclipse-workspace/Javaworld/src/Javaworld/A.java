package Javaworld;

interface D {
	default void parent1() {
		System.out.println("Parent 1 is there ");
		}
}
interface B{
	default void parent2() {
		System.out.println("Parent 2 is there");
	}
}
class C implements D,B {
	  void parent() {
		System.out.println("Child is there");
	}
	}
public class A{
public static void main(String[] args) {
	C c =new C();
	c.parent();
	c.parent1();
	c.parent2();
}
}