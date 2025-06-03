package Javaworld;
class Cowss
{
String sound="Generic Animal Sound";
 void makeSound1() {
	 System.out.println("Animal makes sound");
 }
}
class Dogs extends Cowss
{
String sound="Bark";
void makeSound1()
{
super.makeSound1();
System.out.println("Animal makes:" +super.sound);
System.out.println("Dog makes:" +sound);

}

}

public class keyword_super {

	public static void main(String[] args) {
		Dogs d1=new Dogs();
		d1.makeSound1();

	}

}

