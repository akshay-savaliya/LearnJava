package OOP;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Number of Circles : " + Circle.numberOfCircles);    // 0
//        System.out.println("Number of Circles : " + Circle_2.numberOfCircles_2);    // ERROR

        Circle c1 = new Circle();    // Default Constructor
        Circle_2 cc1 = new Circle_2();
        System.out.println(c1.center);    // null
        System.out.println(c1.radius);    // 0.0
        System.out.println("Number of Circles : " + Circle.numberOfCircles);    // 1

        c1.center = new Point(0, 0);
        c1.radius = 3;
//        cc1.radius = 10;    // ERROR
        cc1.setRadius(10);
        System.out.println(c1.center);    // java.awt.Point[x=0,y=0]
        System.out.println(c1.radius);    // 3.0
        System.out.println(cc1.getRadius());
        System.out.println("Number of Circles : " + Circle.numberOfCircles);    // 1
        System.out.println("Number of Circles : " + Circle_2.getNumberOfCircles_2());    // 1

        c1.numberOfCircles = 11;

        Circle c2 = new Circle(new Point(1, 2), 3);    // Parameterized Constructor
        System.out.println(c2.center);    // java.awt.Point[x=1,y=2]
        System.out.println(c2.radius);    // 3.0
        System.out.println("Number of Circles : " + Circle.numberOfCircles);    // 12
        System.out.println("Number of Circles : " + Circle.getNumberOfCircles());    // 12
        System.out.println("Number of Circles : " + c1.getNumberOfCircles());    // 12
        System.out.println("Number of Circles : " + c2.getNumberOfCircles());    // 12

        c1.setCenter(new Point(1, 1));
        c1.setRadius(1);
        System.out.println(c1.center);    // java.awt.Point[x=1,y=1]
        System.out.println(c1.radius);    // 1.0

        System.out.println("Area = " + c1.getArea());    // Area = 3.141592653589793
        System.out.println("Perimeter = " + c1.getPerimeter());    // Perimeter = 6.283185307179586

    }
}
