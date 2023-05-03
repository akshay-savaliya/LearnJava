package OOP;

abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new Animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
//    if Don't create walk ---> give ERROR ---> Because walk is abstract.
    public void walk() {
        System.out.println("Horse walks on 4 legs.");
    }

    Horse() {
        System.out.println("Created Horse.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken Walks on 2 legs.");
    }

    Chicken() {
        System.out.println("Created Chicken.");
    }
}
public class Abstraction {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        System.out.println("----------");

        Chicken c1 = new Chicken();
        c1.walk();
        c1.eat();
        System.out.println("----------");

//        Animal a1 = new Animal();    // abstract class
    }
}
