package Javaworld;
class Cow{
	void many() { 
		System.out.println("Some Animlas");
	}
}
class Dog extends Cow{
	@Override
	void many() {
		System.out.println("Dogs are there");
		super.many();	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog d=new Dog();
     d.many();
	}
}




