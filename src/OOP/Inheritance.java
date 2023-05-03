package OOP;

//    Base class
class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

//    Derived class
//    Single inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

//    Hierarchical inheritance
class Circle1 extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

//    Multilevel inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

public class Inheritance {

    public static void main(String[] args) {


    }

}
