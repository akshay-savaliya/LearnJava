package Recursion;

import java.util.Scanner;

public class Permutation {

//    Print all Permutation of a String.

    public static void printPerm(String str, String permutation) {

        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currChar);
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();
        printPerm(str, "");

    }
}
