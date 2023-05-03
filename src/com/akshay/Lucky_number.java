package com.akshay;

import java.util.Scanner;

public class Lucky_number {

    public static void main(String[] args) {

//        ABCD
//        int fourthDigit = n % 10;    // ABCD % 10 = D
//        int thirdDigit = (n / 10) % 10;    // ABC % 10 = C
//        int secondDigit = (n / 100) % 10;    // AB % 10 = B
//        int firstDigit = (n / 1000) % 10;     // A % 10 = A

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a four-digit number : ");
        int n = num.nextInt();

        if (!(n > 999 && n<10000)) {
            System.out.println(n + " is not a four-digit number");
        }
        else {
            int fourthDigit = n % 10;
            int thirdDigit = (n / 10) % 10;
            int secondDigit = (n / 100) % 10;
            int firstDigit = (n / 1000) % 10;

            if (firstDigit + secondDigit == thirdDigit + fourthDigit)
                System.out.println("lucky");
            else
                System.out.println("not lucky");
        }
    }
}
