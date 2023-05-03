package com.akshay;

public class Variable_length_argument_lists {
    public static void main(String[] args) {

//        -----------------------------------Variable_length_argument_lists-----------------------------------
//        -Only one Variable_length parameter may be specified in a method
//        -It must be the last parameter
//        -Any other parameters must precede it
//        -We can pass an array or a variable number of arguments ta a Variable_length parameter
//        -When invoking a method with a variable number of arguments, java creates an array and passes the arguments to it.


        System.out.println(sum(1, 2));    // 3
        System.out.println(sum(1, 2, 3));    // 6
        System.out.println(sum(1, 2, 3, 4));    // 10
        System.out.println(sum(1, 2, 3, 4, 5));    // 15
        System.out.println(sum(1, 2, 3, 4, 5, 6));    // 21

        int[] num = {1, 2, 3, 4, 5};
        System.out.println(sum(num));    // 15

        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));    //15

    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

//    public static void print(String... strings, double... numbers) {    // ERROR
//
//    }

//    public static void print(double... numbers, String name) {    // ERROR
//
//    }

    public static void print(String name, double... num) {    // NOT ERROR

    }
}
