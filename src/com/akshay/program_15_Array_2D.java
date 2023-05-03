package com.akshay;

import java.util.Arrays;
import java.util.Scanner;

public class program_15_Array_2D {
    public static void main(String[] args) {

//        Write a program that prints the sum of each row & column in a 2D array.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Row size : ");
        int row = input.nextInt();
        System.out.print("Enter Column size : ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr [" + i + "][" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Your Array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] row_sum = new int[row];
        int[] col_sum = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                row_sum[i] += arr[i][j];
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                col_sum[j] += arr[i][j];
            }
        }

        for (int i = 0; i < row_sum.length; i++) {
            System.out.println("Sum of Row " + (i + 1) + " : " + row_sum[i]);
        }

        for (int i = 0; i < col_sum.length; i++) {
            System.out.println("Sum of Column " + (i + 1) + " : " + col_sum[i]);
        }

//        System.out.println(Arrays.toString(row_sum));
//        System.out.println(Arrays.toString(col_sum));

    }
}
