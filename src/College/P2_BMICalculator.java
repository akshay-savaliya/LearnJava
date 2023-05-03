package College;

import java.util.Scanner;

public class P2_BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds and height in inches
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        // Convert weight to kilograms and height to meters
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        // Display the result
        System.out.println("BMI is : " + bmi);

    }
}
