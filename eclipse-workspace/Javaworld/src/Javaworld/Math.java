package Javaworld;

class Rectangle {
    double length, width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + width);
    }
}

public class Math {
    public static void main(String[] args) {
        // Creating two rectangle objects
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(7, 3);

        // Displaying area and perimeter for both rectangles
        System.out.println("Rectangle 1 - Area: " + rect1.area() + ", Perimeter: " + rect1.perimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.area() + ", Perimeter: " + rect2.perimeter());
    }
}

