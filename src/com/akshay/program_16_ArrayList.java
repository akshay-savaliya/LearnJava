package com.akshay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class program_16_ArrayList {
    public static void main(String[] args) {

//        Create a list of unique elements taken from user.Sort and print these elements.
//        Example:
//        Enter 10 integers : 1 8 9 2 6 6 1 3 5 5
//        Your unique sorted Element : [1, 2, 3, 5, 6, 8, 9]
//        Enter 5 Strings : ab ab ab bc bc
//        Your unique sorted Element : [ab, bc]

        ArrayList<Integer> integers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("How many Elements you want to Enter :");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element [" + (i + 1) + "] : ");
            int temp = input.nextInt();
            if (!integers.contains(temp)) {
                integers.add(temp);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);

    }
}
