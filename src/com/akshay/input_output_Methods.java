package com.akshay;

import java.util.Scanner;

public class input_output_Methods {
    public static void main(String[] args) {

//        System.in ---> point to keyboard
//        System.out ---> point to screen

//        Scanner --> is a Class ---> using new keyword ---> Create class object
//        new Scanner() ---> is a constructor
//        constructor name same as the class name

//        input.next() ---> Read a String
//        input.nextInt() ---> Read an integer
//        input.nextDouble() ---> Read a double
//        input.nextByte() ---> Read a byte
//        input.nextShort() ---> Read a short
//        input.nextLong() ---> Read a long
//        input.nextFloat() ---> Read a float
//        input.nextBoolean() ---> Read a boolean

//        input.next().charAt(0); ---> Read a char

//        We don't have ---> input.nextChar()


        System.out.print("Enter Your Name : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Your Name Is : " + name);         // .next() --> only read String --> before the space

        System.out.print("Enter Your Full Name : ");
        Scanner inputFull = new Scanner(System.in);
        System.out.println("Your Full Name Is : " + inputFull.nextLine());    // .nextLine() --> read --> Full Sentence --> including spaces

        System.out.println("Enter Your Gender (M,F,T) : ");
        Scanner g = new Scanner(System.in);
        char gender = g.next().charAt(0);
        System.out.println("Your Sex Is " + gender);

        System.out.print("Enter your favorite integer : ");
        Scanner num = new Scanner(System.in);
        int favNum = num.nextInt();
        System.out.println(favNum+" is my favorite integer too!");

        System.out.print("Enter your Age : ");
        Scanner age = new Scanner(System.in);
        System.out.println(name+"!"+" You are "+age.nextDouble()+" year old!");


    }







}
