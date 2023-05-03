package Sorting;

import java.util.Scanner;

public class Bubble_Sort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.print("How many element you want to Enter : ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element [" + (i + 1) + "] : ");
            arr[i] = input.nextInt();
        }

        System.out.print("Your Array : ");
        printArray(arr);
        System.out.println();

//        Bubble Sort
//        Time Complexity = O(n^2)

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}
