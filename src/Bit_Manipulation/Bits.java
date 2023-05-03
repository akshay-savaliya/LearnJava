package Bit_Manipulation;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {

//        -------------------------Get Bit-------------------------
//        Ex: Get the 3rd bit (position=2) of a number n. (n=0101)->5 of Decimal

//        int n = 5;    // 0101
//        int pos = 2;
//        int bitMask = 1 << pos;
//        if ((bitMask & n) == 0) {
//            System.out.println("bit was zero.");    // Bit was zero.
//        } else {
//            System.out.println("bit was one.");
//        }

//        -------------------------Set Bit-------------------------
//        Ex: Set the 2rd bit (position=1) of a number n. (n=0101)->5 of Decimal

//        int n = 5;    // 0101
//        int pos = 1;
//        int bitMask = 1 << pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);    // 7

//        -------------------------Clear Bit-------------------------
//        Ex: Clear the 3rd bit (position=2) of a number n. (n=0101)->5 of Decimal

//        int n = 5;    // 0101
//        int pos = 2;
//        int bitMask = 1 << pos;
//        int notBitMask = ~(bitMask);
//
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);    // 1

//        -------------------------Update Bit-------------------------
//        Ex: Update the 2rd bit (position=1) of a number n to 1. (n=0101)->5 of Decimal

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 OR 1 : ");
        int oper = input.nextInt();

//        oper = 1 ---> set
//        oper = 0 ---> clear

        int n = 5;    // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1) {
//            set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
//            clear
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
