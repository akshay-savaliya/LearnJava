package com.akshay;

import java.awt.*;
import java.util.Arrays;

public class Arrays_1D {
    public static void main(String[] args) {

//        -----------------------------------Default values-----------------------------------

//        0 ---> numeric primitive data types
//        \u0000 ---> char types
//        false ---> boolean types
//        null ---> reference types


//        -----------------------------------1D ARRAYS-----------------------------------

        int[] numbers = new int[5];    // {0, 0, 0, 0, 0}
        numbers[0] = 4;    // {5, 0, 0, 0, 0}
        numbers[1] = 1;    // {5, 4, 0, 0, 0}
        numbers[2] = 2;    // {5, 4, 3, 0, 0}
        numbers[4] = 3;    // {5, 4, 3, 2, 1}
//                      OR
//        int[] numbers = {1, 2, 3, 4, 5};
//                      NOT
//        int[] numbers;
//        numbers = {1, 2, 3, 4, 5};    // ERROR

        System.out.println(numbers);    // ADDRESS

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

//        -----------------------------------sort(array) : sorts the whole array-----------------------------------

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        char[] characters = {'a', 'c', 'b', 'e', 'd', 'f'};
        Arrays.sort(characters);
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
        System.out.println();

        int[] unicodes = {'a', 'c', 'b', 'e', 'd', 'f'};
        Arrays.sort(unicodes);
        for (int i = 0; i < unicodes.length; i++) {
            System.out.print(unicodes[i] + " ");
        }
        System.out.println();

        String[] strings = {"hij", "abc", "efg"};
        Arrays.sort(strings);    // abc,efg,hij
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();

//        ----------sort(array, fromIndex, toIndex) : sort from (fromIndex) to (toIndex - 1)----------

        int num[] = {5, 4, 3, 2, 1, 0, -1};
        Arrays.sort(num, 3, 7);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

//        -----------------------------------Searching Arrays-----------------------------------
//        using ---> binarySearch()
//        - The array should be sorted in increasing order
//        - binarySearch(array,element)

//        Return values:
//        - index of element inside the array if exists
//        - -(insertionIndex + 1) if the element was not found

        int[] numbers1 = {1, 6, 4, 5, 2, -1, 0};
        Arrays.sort(numbers1);    // -1,0,1,2,4,5,6
        System.out.println(Arrays.binarySearch(numbers1, 0));    //1
        System.out.println(Arrays.binarySearch(numbers1, -3));    //-1 ---> -(insertionIndex + 1) ---> -(0+1)
        System.out.println(Arrays.binarySearch(numbers1, 3));    //-5 ---> -(insertionIndex + 1) ---> -(4+1)
        System.out.println(Arrays.binarySearch(numbers1, 7));    //-8 ---> -(insertionIndex + 1) ---> -(7+1)

//        -----------------------------------Comparing Arrays-----------------------------------
//        using ---> equals()

        int[] num1 = {5, 4, 3, 2, 1, 0, -1};
        int[] num2 = {5, 4, 3, 2, 1, 0, -1};
        int[] num3 = {5, 4, 3, 7, 7, 0, -1};
        System.out.println(num1 == num2);    // false ---> because in this compare address
        System.out.println(Arrays.equals(num1, num2));    // true
        System.out.println(Arrays.equals(num1, num3));    // false

        String[] str1 = {"a", "b", "c"};
        String[] str2 = {"a", "b", "c"};
        System.out.println(str1 == str2);    // false ---> because in this compare address
        System.out.println(Arrays.equals(str1, str2));    // true

        Point[] p1 = {new Point(1, 2), new Point(3, 4)};
        Point[] p2 = {new Point(1, 2), new Point(3, 4)};
        Point[] p3 = {new Point(0, 0), new Point(3, 4)};
        System.out.println(p1 == p2);    // false
        System.out.println(Arrays.equals(p1, p2));    // true
        System.out.println(Arrays.equals(p1, p3));    // false

//        -----------------------------------fill(array, value) : fill whole array-----------------------------------

        int[] num4 = new int[5];    // {0,0,0,0,0}
        Arrays.fill(num4, 3);    // {3,3,3,3,3}
        for (int i = 0; i < num4.length; i++) {
            System.out.print(num4[i] + " ");
        }
        System.out.println();

        String[] strings2 = new String[3];    // {null, null, null}
        Arrays.fill(strings2, "hello");    // {hello, hello, hello}
        for (int i = 0; i < strings2.length; i++) {
            System.out.print(strings2[i] + " ");
        }
        System.out.println();

        Point[] points = new Point[3];    // {null, null, null}
        Arrays.fill(points, 0, 2, new Point(1, 2));    // {(1,2), (1,2), null}
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + " ");
        }
        System.out.println();

//        -----------------------------------fill(array, fromIndex, toIndex, value)-----------------------------------

        int[] num5 = new int[5];    // {0,0,0,0,0}
        Arrays.fill(num5, 1, 4, 3);    // {0,3,3,3,0}
        System.out.println(Arrays.toString(num5));
        System.out.println();

//        -----------------------------------Printing Arrays-----------------------------------
//        using ---> toString()

        System.out.println(Arrays.toString(strings2));    // [hello, hello, hello]

        System.out.println(Arrays.toString(points));    // [java.awt.Point[x=1,y=2], java.awt.Point[x=1,y=2], null]



    }
}
