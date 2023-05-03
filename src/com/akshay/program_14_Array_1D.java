package com.akshay;

import java.util.Scanner;

public class program_14_Array_1D {
    public static void main(String[] args) {

//        Write a program that display the number of occurrences of an elements in the array.
//        Example :
//        [1,1,1,2,3,4]
//        3 occurs 1 time
//        1 occurs 3 times
//        7 occurs 0 times

        System.out.print("How many element you want to Enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element [" + (i + 1) + "] : ");
            numbers[i] = input.nextInt();
        }

        int count = 0;

        System.out.print("Enter a search element : ");
        int key = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                count++;
            }
        }

        System.out.println(key + " occurs " + count + " times");
    }
}
