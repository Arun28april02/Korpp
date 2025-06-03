package Javaworld;
class Animal{
	void Bark() {
		System.out.println("Animal is Barks");
	}
}
class Sheep extends Animal{
	void Grass(){
		System.out.println("Sheep Eating Grass");
		}
}
class Lamb extends Sheep{
	void Milk() {
		System.out.println("Lamb drinks Milk");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Lamb lamb=new Lamb();
		lamb.Milk();
		lamb.Grass();
		lamb.Bark();
		Sheep sheep=new Sheep();
		sheep.Grass();
		sheep.Bark();
		Animal a =new Animal();
		a.Bark();
     }
}
