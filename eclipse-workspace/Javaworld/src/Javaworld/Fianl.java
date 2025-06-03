package Javaworld;
final class Keyword{
	final int legs =4;
	final void makesound() {
		System.out.println("Animal make Sound");
	}
}
public class Fianl {
  public static void main(String[] args) {
	  Keyword obj=new Keyword();
	  System.out.println("Legs ="+obj.legs);
	  obj.makesound();
  }
}
