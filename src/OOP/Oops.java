package OOP;


class Pen {
    String color;
    String type;    // ballpoint, gel
    int price;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

//    Polymorphism
    public void printInfo(String color) {
        System.out.println(color);
    }
    public void printInfo(int price) {
        System.out.println(price);
    }
    public void printInfo(String color, String type, int price) {
        System.out.println(color + " " + type + " " + price);
    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //    default constructor
    Student() {
        System.out.println("Constructor called");
    }

    //    parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }

}
public class Oops {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "gel";
        p1.write();
        p1.printColor();
        System.out.println("----------");

        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "ballpoint";
        p2.write();
        p2.printColor();
        System.out.println("----------");

        Student s1 = new Student();
        s1.name = "ABC";
        s1.age = 19;
        s1.printInfo();
        System.out.println("----------");

        Student s2 = new Student("DEF", 20);
        s2.printInfo();
        System.out.println("----------");

        Student s3 = new Student(s1);
        s3.printInfo();
        System.out.println("----------");

        System.out.println("Polymorphism");
        Pen p3 = new Pen();
        p3.color = "black";
        p3.type = "gel";
        p3.price = 10;
        p3.printInfo(p3.color);
        p3.printInfo(p3.price);
        p3.printInfo(p3.color, p3.type, p3.price);
        System.out.println("----------");
    }

}
