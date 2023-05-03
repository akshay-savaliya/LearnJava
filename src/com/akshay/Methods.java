package com.akshay;

public class Methods {
    public static void main(String[] args) {

//        void method ---> A method that does not return a value ---> The return type is void
//        value-returning method ---> A method that returns a value ---> The return type is the type of the data that will be returned
//        The return keyword ---> A keyword that can be used to return a value from a method
//        calling methods


//        calling sayHi
        System.out.println("message1");
        sayHi();
        System.out.println("message2");

//        calling sum
        System.out.println("message3");
        System.out.println(sum(30, 20) + sum(20, 30));    // (30,20) ---> Arguments
        System.out.println("message4");

//        The return keyword
        System.out.println("message5");
        System.out.println(diff(30, 20));
        System.out.println("message6");


    }


//        void method ---> A method that does not return a value ---> The return type is void
    public static void sayHi(){
            System.out.println("Hi");
    }

    //    value-returning method ---> A method that returns a value ---> The return type is the type of the data that will be returned
    public static int sum(int x, int y) {    // (int x, int y) ---> Parameters
        return x + y;
    }

    //    The return keyword
    public static int diff(int x, int y) {
        return x - y;
//        System.out.println("Done");    ERROR
    }

//    public static void sayHii() {
//        return 5;    ERROR ---> return type does not match
//    }
}
