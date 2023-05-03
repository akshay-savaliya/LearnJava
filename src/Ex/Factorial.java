package Ex;

import java.util.Scanner;

public class Factorial {

    public static void printFactorial(int num) {
        if (num < 0) {
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(num + "! = " + factorial);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        printFactorial(num);

    }
}
