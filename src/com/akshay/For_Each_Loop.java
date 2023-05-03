package com.akshay;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class For_Each_Loop {
    public static void main(String[] args) {

//        -----------------------------------FOR EACH LOOP-----------------------------------

//        for (TYPE VAR_NAME : ArrayList / Array) {
//            ...
//        }

//        -In each iteration, the variable VAR_NAME will hold the value of an element inside the Array/ArrayList, starting from the first element.
//        -There is no index
//        -Safe (Boundaries)


        ArrayList<String> itemsArrayList = new ArrayList<>();
        itemsArrayList.add("item1");
        itemsArrayList.add("item2");
        itemsArrayList.add("item3");
        for (String item : itemsArrayList) {
            System.out.print(item + " ");
        }
        System.out.println();

        String[] itemsArray = {"item1", "item2", "item3"};
        for (String item : itemsArray) {
            System.out.print(item + " ");
        }
    }
}
