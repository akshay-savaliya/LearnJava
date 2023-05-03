package com.akshay;

import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {

//        Write a program which displays the sum of digits of an integer read from the user.

//        Example:
//        108 ---> 1 + 0 + 8 = 9
//        1123 ---> 1 + 1 + 2 + 3 = 7

        Scanner n = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = n.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;    // ABCD % 10 = D
            num /= 10;    // ABCD / 10 = ABC
        }
        System.out.println("Sum : " + sum);
    }
}
