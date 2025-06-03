package Javaworld;

interface Van{
	void start();
	default void stop() {
		System.out.println("Vehicle is Stopping");
	}
}
class Motorcycle implements Van{
	@Override
	public void start() {
		System.out.println("Bike is Starting");
	}
}
class Car implements Van{
	@Override
	public void start() {
		System.out.println("Car is Starting ");
	}
}
public class Interface {
	public static void main(String[] args) {
	   Car car=new Car();
	   car.start();
	   car.stop();
	   
	   Motorcycle bike =new Motorcycle();
	   bike.start();
	   bike.stop();
	}
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  