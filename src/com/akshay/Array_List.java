package com.akshay;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {

//        -----------------------------------Array List ---> A resizeable array-----------------------------------
//        -In an ArrayList, We can store objects (String, Integer, Boolean, Double, Character)
//        -not a primitive type (int, boolean, double, char...)

        ArrayList<Integer> integers;    // Null
        integers = new ArrayList<>();

//                  OR

        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

//        -----------------------------------ADD ITEMS-----------------------------------
//        -Using ---> add()

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits);    // [Apple, Banana, Strawberry]

        fruits.add(1, "AtIndex 1");
        System.out.println(fruits);    // [Apple, AtIndex 1, Banana, Strawberry]
        fruits.add(3, "AtIndex 3");
        System.out.println(fruits);    // [Apple, AtIndex 1, Banana, AtIndex 3, Strawberry]

        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");    // Apple AtIndex 1 Banana AtIndex 3 Strawberry
        }
        System.out.println();

//        -----------------------------------ACCESS AN ITEM-----------------------------------
//        -Using ---> get()

        System.out.println(fruits.get(0));    // Apple
        System.out.println(fruits.get(1));    // AtIndex 1
        System.out.println(fruits.get(2));    // Banana

//        -----------------------------------CHANGE AN ITEM-----------------------------------
//        -Using ---> set()

        fruits.set(1, "Orange");    // change AtIndex 1 to Orange
        System.out.println(fruits);    // [Apple, Orange, Banana, AtIndex 3, Strawberry]

//        -----------------------------------REMOVE AN ITEM-----------------------------------
//        -Using ---> remove()
//        -Using ---> clear() ---> remove all elements
//        -Removing by index ---> fruits.remove(1);
//        -Removing by value ---> fruits.remove("Banana");

        fruits.remove(3);    // remove the element at index 3
        System.out.println(fruits);    // [Apple, Orange, Banana, Strawberry]

        fruits.remove("Banana");    // remove "Banana"
        System.out.println(fruits);    // [Apple, Orange, Strawberry]

//        fruits.clear();    // remove all the elements
//        System.out.println(fruits);    // []

//        -----------------------------------SIZE-----------------------------------
//        -Using ---> size()

        System.out.println(fruits.size());    // 3

        fruits.add("Banana");

        System.out.println(fruits.size());    // 4

//        -----------------------------------SORT AN ARRAYLIST-----------------------------------
//        -Using ---> sort()

        System.out.println(fruits);    // [Apple, Orange, Strawberry, Banana]
        Collections.sort(fruits);
        System.out.println(fruits);    // [Apple, Banana, Orange, Strawberry]

        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        System.out.println(integers);    // [1, 5, 3, 4, 2]
        Collections.sort(integers);
        System.out.println(integers);    // [1, 2, 3, 4, 5]

    }
}
