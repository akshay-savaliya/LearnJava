package College;

import java.util.Random;

public class P17_MatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        // Generate a 6x6 matrix filled with random 0's and 1's
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Check that every row and column has an odd number of 1's
        boolean allRowsAndColumnsHaveOddOnes = true;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }
            if (rowSum % 2 == 0 || columnSum % 2 == 0) {
                allRowsAndColumnsHaveOddOnes = false;
                break;
            }
        }

        if (allRowsAndColumnsHaveOddOnes) {
            System.out.println("All rows and columns have an odd number of ones.");
        } else {
            System.out.println("Not all rows and columns have an odd number of ones.");
        }
    }
}

