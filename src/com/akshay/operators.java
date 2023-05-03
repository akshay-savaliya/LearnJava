package com.akshay;

import java.util.Scanner;

public class operators {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int num1 = x.nextInt();
        System.out.print("Enter the value of y : ");
        int num2 = y.nextInt();

        System.out.println("The sum is : " + (num1 + num2));
//        System.out.println("The sum is : " + num1 + num2);      // Not using For Sum --> using For concatenate
        System.out.println("The diff is : " + (num1 - num2));
//        System.out.println("The diff is : " + num1 - num2);      // ERROR!
        System.out.println("The product is : " + (num1 * num2));
//        System.out.println("The product is : " + num1 * num2);      // We can use
        System.out.println("The division is : " + (num1 / num2));
//        System.out.println("The division is : " + num1 / num2);      // We can use
        System.out.println("The remainder is : " + (num1 % num2));
//        System.out.println("The remainder is : " + num1 % num2);      // We can use


//        Dividing an int by an int gives an int
        System.out.println("int/int (1 / 2) : " + (1 / 2));     // 0
//        double d = 1/2;    // double = int ---> implicit casting
//        int i = 1/2;    // int = int


//        Dividing a Double by a Double gives a Double
        System.out.println("Double/double (1.0 / 2.0) : " + (1.0 / 2.0));    // 0.5
//        double d = 1.0 / 2.0;    // double = double
//        int i = 1.0 / 2.0;    // int = double ---> ERROR


//        Dividing a float by a float gives a float
        System.out.println("float/float (1.0f / 2.0f) : " + (1.0f / 2.0f));    // 0.5f
//        double d = 1.0f / 2.0f;    // double = float ---> implicit casting
//        int i = 1.0f / 2.0f; // int = float ---> ERROR


//        Dividing int and Double ---> The int will be cast to a Double automatically
        System.out.println("int/double (1 / 2.0) : " + (1 / 2.0));    // 0.5
        System.out.println("double/int (1.0 / 2) :" + (1.0 / 2));    // 0.5
//        double d = 1 / 2.0;    // double = double;
//        int i = 1 / 2.0;    // int = double ---> ERROR


//        Dividing float and Double ---> The float will be cast to a Double automatically
        System.out.println("float/double (1.0f / 2.0) : " + (1.0f / 2.0));    // 0.5
        System.out.println("double/float (1.0 / 2.0f) : " + (1.0 / 2.0f));    // 0.5
//        double d = 1.0f / 2.0;    // double = double
//        float f = 1.0f / 2.0;    // float = double ---> ERROR

//        Dividing float and int ---> The int will be cast to a float automatically
        System.out.println("float/int (1.0f / 2) : " + (1.0f / 2));    // 0.5f
        System.out.println("int/float (1 / 2.0f) : " + (1 / 2.0f));    // 0.5f
//        double d = 1.0f / 2;    // double = float ---> implicit casting
//        int i = 1.0f / 2;    // int = float ---> ERROR


    }
}
