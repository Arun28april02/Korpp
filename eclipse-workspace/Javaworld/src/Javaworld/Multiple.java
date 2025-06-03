package Javaworld;

interface Animals {
    void eat();
}

interface Bird {
    void fly();
}

class Sparrow implements Animals, Bird {
    public void eat() {
        System.out.println("Sparrow eats grains");
    }

    public void fly() {
        System.out.println("Sparrow flies in the sky");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Sparrow mySparrow = new Sparrow();
        mySparrow.eat();
        mySparrow.fly();
    }
}
