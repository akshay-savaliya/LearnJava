package com.akshay;

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {

//      Write a program that reads an integer n and display the nth Fibonacci number

//        The Fibonacci Sequence is a sequence of numbers where the first two numbers in the sequence are 1 and 1.
//        Example: 1,1,2,3,5,8,13,...

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a nth place (positive integer) : ");
        int n = s.nextInt();

        int result = 0;
        int v1 = 1;
        int v2 = 1;
        if (n >= 1) {

            System.out.print(v1 + " ");
        }
        if (n >= 2) {
            System.out.print(v2 + " ");
        }
        for (int i = 1; i <= n - 2; i++) {
            result = v1 + v2;
            System.out.print(result + " ");
            v1 = v2;
            v2 = result;
        }
        System.out.println();

        if (n == 1 || n == 2) {
            result = 1;
            if (n == 1)
                System.out.println(n + "st place value = " + result);
            if (n == 2)
                System.out.println(n + "nd place value = " + result);
        }
        if (n > 2) {
            if (n == 3)
                System.out.println(n + "rd place value = " + result);
            else
                System.out.println(n + "th place value = " + result);
        }
    }
}
