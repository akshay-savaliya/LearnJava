package com.akshay;

import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {

//        Write a program which reads a sequence of integer from the user and stop by displaying "Done" when the sum of these values exceeds 100.

        Scanner n = new Scanner(System.in);
        int sum = 0;

//        while (true) {
//            System.out.println("Enter a numbers : ");
//            sum = sum + n.nextInt();
//            if (sum > 100) {
//                break;
//            }
//        }

//        while (sum <= 100) {
//            System.out.println("Enter a numbers : ");
//            sum = sum + n.nextInt();
//        }

        do {
            System.out.println("Enter a numbers : ");
            sum = sum + n.nextInt();
        } while (sum <= 100);

        System.out.println("Done : " + sum);

    }
}
