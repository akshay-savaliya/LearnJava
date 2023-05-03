package College;

import java.util.Scanner;

public class P1_LinearEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the constants a, b, c, d, e, and f
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Calculate the determinant of the coefficient matrix
        double det = a * d - b * c;

        // Check if the equation has a solution
        if (det == 0) {
            System.out.println("The equation has no solution");
        } else {
            // Calculate the solutions using Cramer's rule
            double x = (e * d - b * f) / det;
            double y = (a * f - e * c) / det;

            // Display the solutions
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
