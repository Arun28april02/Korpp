package Javaworld;
abstract class Vehicle{
	abstract void speed();
}
class Bike extends Vehicle{
	void size(){
		System.out.println("It is a Two Wheeler");
	}
      @Override
	void speed() {
		System.out.println("It has 200kmp");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bike bike=new Bike();
        bike.size();
        bike.speed();
	}

}
