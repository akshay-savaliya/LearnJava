package com.akshay;

public class Method_Overloading {
    public static void main(String[] args) {

        System.out.println(sum(2, 3));    // 5

        System.out.println(sum(1, 2, 3));    // 6

        sayHi();

        sayHi("Hello");

//        System.out.println(sayHi("Hello"));



    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    public static void sayHi(String str) {
        System.out.println("Hi " + str);
    }

//    Overloaded methods must have different parameters

//    public static String sayHi(String str) {    // ERROR
//        return "Hi " + str;
//    }

}
