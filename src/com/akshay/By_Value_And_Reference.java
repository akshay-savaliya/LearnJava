package com.akshay;

import java.awt.*;

public class By_Value_And_Reference {
    public static void main(String[] args) {

//        passing arguments by value
        System.out.println("passing arguments by value");
        int x = 1;
        increment(x);
        System.out.println(x);

//        passing arguments by reference
        System.out.println("passing arguments by reference");
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        System.out.println("x = " + p1.x + ", y = " + p1.y);
        change(p1);
        System.out.println("x = " + p1.x + ", y = " + p1.y);

    }
    public static void increment(int x) {
        x++;
        System.out.println(x);
    }

    public static void change(Point p) {
        p.x = 2;
        p.y = 1;
    }
}


