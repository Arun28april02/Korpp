package Javaworld;
public class Outer {
	static class Inner{
		void display() {
		System.out.println(" static nested class");
	}}

	public static void main(String[] args) {
		Outer.Inner obj=new Outer.Inner();
		obj.display();

	}

}