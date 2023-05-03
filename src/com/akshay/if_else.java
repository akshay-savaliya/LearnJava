package com.akshay;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        System.out.print("Enter a Number : ");

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }

    }
}
