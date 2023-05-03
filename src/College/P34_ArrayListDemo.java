package College;

import java.util.ArrayList;
import java.util.Date;

public class P34_ArrayListDemo {
    public static void main(String[] args) {
        // create an ArrayList to hold objects of different types
        ArrayList<Object> list = new ArrayList<>();

        // add different types of objects to the list
        list.add(new Loan(1000, 2.5, 12));
        list.add(new Date());
        list.add("Hello, World!");
        list.add(new Circ(5));

        // loop through the list and display each element using toString() method
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

class Loan {
    private double amount;
    private double interestRate;
    private int term;

    public Loan(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    public String toString() {
        return "Loan: amount=" + amount + ", interestRate=" + interestRate + ", term=" + term;
    }
}

class Circ {
    private double radius;

    public Circ(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle: radius=" + radius;
    }
}

