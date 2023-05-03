package College;

public class Circle {
    private double radius;
    private double area;

    // constructor that accepts a double value as radius
    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    // constructor that accepts an integer value as radius and calculates area
    public Circle(int radius) {
        this((double) radius);
    }

    // method to get the radius of the circle
    public double getRadius() {
        return radius;
    }

    // method to get the area of the circle
    public double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(7);

        System.out.println("Circle with radius " + c1.getRadius() + " has area " + c1.getArea());
        System.out.println("Circle with radius " + c2.getRadius() + " has area " + c2.getArea());
    }
}

