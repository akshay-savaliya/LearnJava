package com.akshay;

import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {

//        Write a program which reads a positive number N from the user then indicates if N is prime or not.

//        Example:
//        3,5,7 ---> prime numbers
//        10,15 ---> not prime number
//        N is a prime number if its divisors are only 1 and N

        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = n.nextInt();

//        Method ---> 1
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? (num) + " is a prime number" : (num) + " is Not prime number");


//        Method ---> 2
//        int sum = 0;
//        for (int i = 1; i <= num / 2; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum == 1 ? (num) + " is a prime number" : (num) + " is Not prime number");


    }
}
