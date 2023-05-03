package College.P28;

// Shape2D interface
interface Shape2D {
    double calculateArea();
}

// Shape3D interface
interface Shape3D {
    double calculateVolume();
}

// Abstract class Shape
abstract class Shape {
    public abstract void display();
}

// Circle class implements Shape2D
class Circle implements Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Area of circle: " + calculateArea());
    }
}

// Sphere class implements Shape3D
class Sphere implements Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return 4.0/3.0 * Math.PI * radius * radius * radius;
    }

    public void display() {
        System.out.println("Volume of sphere: " + calculateVolume());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of Circle and Sphere
        Circle circle = new Circle(5.0);
        Sphere sphere = new Sphere(3.0);

        // Call the display method for each instance
        circle.display();
        sphere.display();
    }
}

