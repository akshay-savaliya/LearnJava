package com.akshay;

import java.util.Scanner;

public class program_7 {
    public static void main(String[] args) {

//        Write a program which displays a string with a space after each character.

//        Example:
//        ab cd ---> a b  c d
//        ABC   DE ---> A B C    D E

//        Method ---> 1
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a String : ");
//        String str = s.nextLine();
//        int n = 0;
//        while (n <= str.length()-1) {
//            System.out.print(str.charAt(n) + " ");
//            n++;
//        }


//        Method ---> 2
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = s.nextLine();
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }
}
