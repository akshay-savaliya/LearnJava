package com.akshay;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {

//        Write a program which reads a sequence of positive integers. The program stop when the user fills a negative value.
//        and also shows the maximum and the minimum of these numbers.

//        Example:
//        0 6 5 7 -1 ---> max = 7, min = 0

        Scanner n = new Scanner(System.in);
        System.out.print("Enter a positive Number : ");
        int num = n.nextInt();
        int max = num;
        int min = num;

        if (num >= 0) {
            while (true) {
                System.out.print("Enter a positive Number : ");
                num = n.nextInt();
                if (num < 0) {
                    break;
                }
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }
}
