package Javaworld;

class Main1 {
    String name = "Bindu";// Reference variable (points to an object)

    // Constructor to initialize the object
    Main1(String name) {
       this.name = name;
       //name ="Bindu";
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Primitive variables (hold actual values)
        int age = 25; 
        double height = 5.9;
        boolean isStudent = false;

        // Reference variable (points to an object)
        Main1 obj = new Main1("Arun");

        // Non-primitive variable (Array - complex structure)
        int[] numbers = {1, 2, 3, 4, 5};

        // Output
        System.out.println("Primitive - Age: " + age);
        System.out.println("Primitive - Height: " + height);
        System.out.println("Primitive - Is Student?: " + isStudent);

     obj.display(); // Using the reference variable to call a method

        System.out.print("Non-primitive - Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
