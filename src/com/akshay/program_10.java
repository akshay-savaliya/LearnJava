package com.akshay;

import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {

//        Write a program that reads a positive integer N and displays the following:
//        Example:
//              *
//             **
//            ***
//           ****
//          *****
//         ******
//        *******

//        System.out.print("Enter a number : ");
//        Scanner n = new Scanner(System.in);
//        int num = n.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= num-i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        ----------------------------------------------------------------------

//        Write a program that reads a positive integer N and displays the following:
//        Example for N = 6
//              *
//             * *
//            *   *
//           *     *
//          *       *
//         ***********

//        System.out.print("Enter a number : " );
//        Scanner n = new Scanner(System.in);
//        int num = n.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//
//            }
//
//            System.out.println();
//        }

//        ----------------------------------------------------------------------

//        Write a program that reads a positive integer N and displays the following:
//        Example for N = 3
//        ***
//        ***
//        ***

//        System.out.print("Enter a number : ");
//        Scanner n = new Scanner(System.in);
//        int num = n.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= num; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        ----------------------------------------------------------------------

//        Write a program that reads a positive integer N and displays the following:
//        Example for N = 5
//        *****
//        *   *
//        *   *
//        *   *
//        *****

//        System.out.print("Enter a number : ");
//        Scanner n = new Scanner(System.in);
//        int num = n.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//
//            if (i == 1 || i == num)
//                for (int j = 1; j <= num; j++)
//                    System.out.print("*");
//            else
//                for (int j = 1; j <= num; j++)
//                    if(j == 1 || j == num)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//
//            System.out.println();
//        }

//        ----------------------------------------------------------------------

//        Write a program that reads a positive integer N and displays the following:
//        Example for N = 5
//        *****
//         ***
//         ***
//         ***
//        *****
//        Example for N = 3
//        ***
//         *
//        ***

        System.out.print("Enter a number : ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == num) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

}
