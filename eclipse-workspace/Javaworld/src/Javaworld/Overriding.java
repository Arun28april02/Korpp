package Javaworld;
class Animal1 {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
   @Override
    void makeSound() { // Overriding method
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal1 myAnimal = new Dog1(); 
        myAnimal.makeSound();
        myAnimal.makeSound();
    }
}

