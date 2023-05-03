package com.akshay;

import java.util.Scanner;

public class program_9 {
    public static void main(String[] args) {

//        Write a program that reads a positive integer N from the user and display the following:

//        Example:
//        1
//        22
//        333
//        4444
//        ...

        System.out.print("Enter a number : ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
