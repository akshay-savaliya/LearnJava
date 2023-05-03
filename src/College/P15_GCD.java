package College;

import java.util.Scanner;

public class P15_GCD {

    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}

