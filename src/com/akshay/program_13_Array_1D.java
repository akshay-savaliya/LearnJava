package com.akshay;

import java.util.Scanner;

public class program_13_Array_1D {
    public static void main(String[] args) {

//        Write a program that display the sum,product, and average of the element of an integer array.
//        Example :
//        [1,2,-3,5,7] ---> sum = 12, product = -210, average = 2.4

        System.out.print("How many element you want to Enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "] : ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        int product = 1;
        double avg;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }

        avg = (double) sum / numbers.length;

        System.out.println("SUM : " + sum);
        System.out.println("PRODUCT : " + product);
        System.out.println("AVG : " + avg);

    }
}
