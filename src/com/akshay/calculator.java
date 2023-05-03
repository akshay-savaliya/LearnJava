package com.akshay;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        double num1 = n1.nextDouble();
        System.out.print("Enter Number 2 : ");
        double num2 = n2.nextDouble();
        System.out.print("Enter Operator (+,-,*,/) : ");
        char operator = op.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
