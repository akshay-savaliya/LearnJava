package com.akshay;

import java.util.ArrayList;
import java.util.Scanner;

public class program_17_ArrayList {
    public static void main(String[] args) {

//        Create a menu program with the following options:
//        1. Add Element
//        2. Remove Element
//        3. Display Elements
//        4. Exit
//        This program runs infinitely until the user chooses the fourth option.

        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer : ");
                    integers.add(input.nextInt());
                    System.out.println("Added.");
                    break;
                case 2:
                    System.out.print("Enter the number to remove : ");
                    int elementToRemove = input.nextInt();
                    if (integers.contains(elementToRemove)) {
//                        integers.remove(elementToRemove);    // Not work because .remove() accepts only Index OR Object but elementToRemove is int
                        integers.remove(Integer.valueOf(elementToRemove));    // Integer.valueOf(elementToRemove) ---> This method return the integer object
                        System.out.println("Removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    System.out.println("Your List : " + integers);
                    break;
                case 4:
                    System.out.println("Good bye");
                    return;
                default:
                    System.out.println("Enter a valid input.");
            }
        }

    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your Choice: ");

    }
}
