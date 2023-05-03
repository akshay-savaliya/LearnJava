package com.akshay;

import java.util.Scanner;

public class special {
    public static void main(String[] args) {

        Scanner w = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter a number between 1 and 10 : ");
            n = w.nextInt();

            if (n < 1 || n > 10) {
                continue;
            }
//            System.out.println(n + " is between 1 and 10");
            break;
        }
        System.out.println(n + " is between 1 and 10");
    }
}
