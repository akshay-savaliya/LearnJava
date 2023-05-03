package com.akshay;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class program_12_Array_1D {
    public static void main(String[] args) {

//        Write a program that fills an array whit n integers entered by the users.
//        Example :
//        Suppose that the user can enter at least 1 number and at most 20 numbers.

        System.out.print("How many elements you want to Enter (Max is 20) : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while (num > 20 || num <= 0) {
            System.out.println("Invalid number, try again : ");
            num = input.nextInt();
        }

        int[] numbers = new int[num];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);

        Point[] points = new Point[num];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.println("The elements are:");
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + (i + 1) + ": ");
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.print("The elements are : ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }
}
