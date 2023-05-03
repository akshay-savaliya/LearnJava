package com.akshay;

public class casting {
    public static void main(String[] args) {

//        (new data type) expression

        int i1 = (int) 4.5;
        int i2 = (int) 8L;
        float f1 = (float) 4.5;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(f1);

        double d1 = 4.5 + 3;
        System.out.println(d1);
        double d2 = 4.5 + (double) 3;
        System.out.println(d2);

        int i3 = i1 + i2 + (int) d1 + (int) d2;
        System.out.println(i3);


//        int i4 = 1 / 2;    // ok, int = int
////        int i5 = 1.0 / 2;    // ERROR, int = double
//        int i6 = (int) (1.0 / 2);    // ok, int = int
//        int i7 = (int) (1.0f / 2);    // ok, int = int
//        int i8 = (int) 1.0f / 2;    // ok, int = int
////        int i9 = 1.0f / (int) 2;    // ERROR, int = float
//        double i10 = 1.0 / 2;    // ok, double = double
//        double i11 = 1 / 2;    // ok, double = int
//        double i12 = (double) 1 / 2;    // ok, double = double
//        float i13 = 1.0f / 2.0f;    // ok, float = float
//        float i14 = 1 / 2;    // ok, float = int


//        int a1 = 3;
//        int a2 = 2;
//        double b1 = 2;
//        System.out.println(a1 / a2);    // 1
//        System.out.println(a1 / b1);    // 1.5
//        System.out.println((double) a1 / a2);    // 1.5
//        System.out.println(a1 / (double) a2);    // 1.5
//        System.out.println((double) a1 / (double) a2);    // 1.5
//        System.out.println((double) (a1 / a2));    // 1.0



    }
}
