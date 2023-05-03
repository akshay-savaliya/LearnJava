package College.P27;

// Abstract class A
abstract class A {
    public abstract void display();
}

// Subclass A1
class A1 extends A {
    public void display() {
        System.out.println("This is A1");
    }
}

// Subclass A2
class A2 extends A {
    public void display() {
        System.out.println("This is A2");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of the subclasses
        A1 a1 = new A1();
        A2 a2 = new A2();

        // Call the display method for each instance
        a1.display();
        a2.display();
    }
}
