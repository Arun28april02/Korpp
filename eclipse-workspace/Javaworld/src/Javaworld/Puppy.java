package Javaworld;

class Cows {
    String name;
}

public class Puppy {
    public static void main(String[] args) {
        Cows dog = new Cows();
        dog.name = "Tommy";

        System.out.println("Before method call: " + dog.name); // Output: Tommy
        changeName(dog);
        System.out.println("After method call: " + dog.name); // Output: Max
    }

    static void changeName(Cows d) {
        d.name = "Max"; // Modifies the object referred to by d
      //
        System.out.println("Inside method: " + d.name); // Output: Max
    }
}
