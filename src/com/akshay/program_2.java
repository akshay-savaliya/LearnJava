package com.akshay;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {

//        Write a program which display the sum of the strict divisors of an integer given by the user.

//        Example:
//        6 ---> 1 + 2 + 3 = 6
//        10 ---> 1 + 2 + 5 = 8
//        The Strict divisors of a number N are <=N/2
//        if N % I = 0, then I is a divisor of N

        Scanner n = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = n.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }

        }
        System.out.println();
        System.out.println("The sum is strict divisors is : " + sum);


    }
}
