package com.akshay;


import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {

//        Write a program which finds if a string is a palindrome string or not.

        System.out.print("Enter a String : ");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                continue;
            }
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
