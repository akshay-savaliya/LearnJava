package College;

import java.util.Scanner;

public class P13_DecimalToFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String input = scanner.nextLine();

        double number = Double.parseDouble(input);

        // Extract the integer and fractional parts of the number
        int integerPart = (int) number;
        double fractionalPart = number - integerPart;

        // Find the greatest common divisor of the numerator and denominator
        int gcd = findGCD((int) (fractionalPart * 10000), 10000);

        // Simplify the fraction by dividing both the numerator and denominator by their GCD
        int numerator = (int) (fractionalPart * 10000) / gcd;
        int denominator = 10000 / gcd;

        // Display the fraction
        System.out.printf("The fraction is %d/%d\n", integerPart * denominator + numerator, denominator);
    }

    // Recursive function to find the greatest common divisor of two numbers
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}

