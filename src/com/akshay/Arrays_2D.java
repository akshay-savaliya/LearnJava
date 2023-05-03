package com.akshay;

import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {

//        -----------------------------------2D ARRAYS-----------------------------------

        int[][] integers = new int[2][2];    // [[0, 0], [0, 0]]

        integers[0][0] = 1;    // [[1, 0], [0, 0]]
        integers[0][1] = 2;    // [[1, 2], [0, 0]]

        integers[1][0] = 3;    // [[1, 2], [3, 0]]
        integers[1][1] = 4;    // [[1, 2], [3, 4]]

//                          OR

        int[][] integer = {{1, 2}, {3, 4}};    // [[1, 2], [3, 4]]

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(integers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("System.out.println(Arrays.toString(integers));");
        System.out.println(Arrays.toString(integers));    // [[I@3d075dc0, [I@214c265e]

        System.out.println("System.out.println(Arrays.deepToString(integers));");
        System.out.println(Arrays.deepToString(integers));    // [[1, 2], [3, 4]]

        int[][] arr = getArray();
        printArray(arr);

    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getArray() {
        return new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }
}
