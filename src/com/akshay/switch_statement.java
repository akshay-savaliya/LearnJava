package com.akshay;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Number From (1-5) : ");
        int n = num.nextInt();

        switch (n) {
            case 1:
                System.out.println("Your Number Is 1");
                break;
            case 2:
                System.out.println("Your Number Is 2");
                break;
            case 3:
                System.out.println("Your Number Is 3");
                break;
            case 4:
                System.out.println("Your Number Is 4");
                break;
            case 5:
                System.out.println("Your Number Is 5");
                break;
            default:
                System.out.println("Your Input Number Is Not In Range (1-5)");
        }

//        switch (n) {
//            case 1 -> System.out.println("Your Number Is 1");
//            case 2 -> System.out.println("Your Number Is 2");
//            case 3 -> System.out.println("Your Number Is 3");
//            case 4 -> System.out.println("Your Number Is 4");
//            case 5 -> System.out.println("Your Number Is 5");
//            default -> System.out.println("Your Input Number Is Not In Range (1-5)");
//        }


    }
}
