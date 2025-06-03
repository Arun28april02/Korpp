package Javaworld;

public class ModelofCars {
	String model;
	String colour;
	String brand;
	int size;
	int speed;
	
	
		void display(String model,String colour,String brand,int size,int speed) {
		System.out.println("Model of car   :"+model);
		System.out.println("Colour name    :"+colour);
		System.out.println("Brand name     :"+brand);
		System.out.println("Size of Car    :"+size);
		System.out.println("Speed of Car   :"+speed);
		System.out.println("--------------------------------");
		}
		
   public static void main(String[] args) {
		ModelofCars m1= new ModelofCars();
		m1.display("Baleno","Blue","Toyato",100,2356);
		
		
		ModelofCars m2= new ModelofCars();
		m2.display("i10","Black","maruthi",150,4569);
		
		
		ModelofCars m3= new ModelofCars();
		m3.display("Scross","Red","maruthi",300,16844);
	
		
	}

}
