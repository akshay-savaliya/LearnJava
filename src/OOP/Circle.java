package OOP;

import java.awt.*;

public class Circle {

    Point center;
    double radius;
    static int numberOfCircles;

//    -Declared directly inside the class
//    -Can be accessed anywhere inside the class, inside all methods
//    -Take default value (center is null & radius is 0.0)

    Circle() {
        numberOfCircles++;
    }

    Circle(Point center, double radius) {
        numberOfCircles++;
        this.center = center;
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    void setCenter(Point newCenter) {
        center = newCenter;
    }

    static int getNumberOfCircles() {
        return numberOfCircles;
    }

}
