package Sorting;

import java.util.Scanner;

public class Selection_Sort {

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

//        Selection Sort
//        Time Complexity = O(n^2)

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}
