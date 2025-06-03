package Javaworld;

class Bmw {
    String model;
    
    Bmw(String model) {
        this.model = model;
    }

    Bmw(Bmw anotherCar) { // Copy constructor
        this.model = anotherCar.model;
    }
}

public class Main45 {
    public static void main(String[] args) {
    	Bmw car1 = new Bmw("Tesla");
    	Bmw car2 = new Bmw(car1); // Copying car1 data
        System.out.println("Car2 model: " + car1.model); // Output: Tesla
        System.out.println("Car1 model: " + car2.model); // Output: Tesla

    }
}
