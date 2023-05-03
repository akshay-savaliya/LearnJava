package com.akshay;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        String myName = "Akshay.";
        System.out.print("My Name is ");
        System.out.println(myName);

        final int age = 20;
//        age=30;                                       // constant, We can not change the value.
        System.out.print("Age:");
        System.out.print(age);
        System.out.print("Year");

        System.out.println("\n");

        System.out.println("How Are You?");
        Akshay.sayFine();
        System.out.println("\n");
        // Not Used because sayGood is a private access
        // Akshay.sayGood();

        byte a1 = 127;                    // byte range : -128 to 127
//        byte a2=-130;                   // error

        short a3 = -32768;                // short range : -32768 to 32767
//        short a4 = 50000;               // error

        long a5 = 800125440;
//        long a6 = 9876543218;             // error


        byte b1 = 10;
        short s1 = 100;
        int i1 = 1000;
        long l1;
        double d1 = 125.25;
        float f1 = 2.4F;
        boolean bo1 = true;
        boolean bo2 = 2>3;

        l1 = b1 + s1 + i1;
        i1 = s1 + b1;
        s1 = b1;

//        i1 = l1;                  // Not ok, because i1 < l1
//        s1 = i1;                  // Not ok, because s1 < i1
//        b1 = i1;                  // Not ok, because b1 < i1

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(bo1);
        System.out.println(bo2);

        System.out.println("\n");

        System.out.print("Byte Min_value : ");
        System.out.println(Byte.MIN_VALUE);
        System.out.print("Byte Max_value : ");
        System.out.println(Byte.MAX_VALUE);

        System.out.println("\n");

        System.out.print("Short Min_value : ");
        System.out.println(Short.MIN_VALUE);
        System.out.print("Short Max_value : ");
        System.out.println(Short.MAX_VALUE);

        System.out.println("\n");

        System.out.print("Int Min_value : ");
        System.out.println(Integer.MIN_VALUE);
        System.out.print("Int Max_value : ");
        System.out.println(Integer.MAX_VALUE);

        System.out.println("\n");

        System.out.print("Long Min_value : ");
        System.out.println(Long.MIN_VALUE);
        System.out.print("Long Max_value : ");
        System.out.println(Long.MAX_VALUE);

        System.out.println("\n");

        System.out.print("Double Min_value : ");
        System.out.println(Double.MIN_VALUE);
        System.out.print("Double Max_value : ");
        System.out.println(Double.MAX_VALUE);

        System.out.println("\n");

        System.out.print("Float Min_value : ");
        System.out.println(Float.MIN_VALUE);
        System.out.print("Float Max_value : ");
        System.out.println(Float.MAX_VALUE);

        System.out.println("\n");


        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\n");

        int code1 = 'A';
        int code2 = '\u0041';
        System.out.println(code1);
        System.out.println(code2);
        System.out.println("\n");
    }

}