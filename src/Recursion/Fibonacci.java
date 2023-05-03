package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static void printFib(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter How many terms you want to print : ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        if (n == 1) {
            System.out.print(a + " ");
        } else if (n == 2) {
            System.out.print(a + " ");
            System.out.print(b + " ");
        } else {
            System.out.print(a + " ");
            System.out.print(b + " ");
            printFib(a, b, n - 2);
        }
    }
}
