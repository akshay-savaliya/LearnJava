package College;

import java.util.Scanner;

public class P3_MeterToFeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a distance in meters: ");
        double meters = input.nextDouble();

        double feet = meters * 3.28084;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
}