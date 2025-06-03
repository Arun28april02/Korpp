package Javaworld;
class Example12 {
    String name;

    // Constructor (no return type, same name as the class)
    Example12(String name) {
        this.name = name;
        System.out.println("Constructor executed: " + name);
    }

	// Method (explicit return type, can be called multiple times)
    void display() {
        System.out.println("Method executed: " + name);
    }

    public static void main(String[] args) {
        Example12 obj = new Example12("Arun"); 
         obj.display(); // Method called
    }
}
