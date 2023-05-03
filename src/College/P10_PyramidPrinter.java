package College;

import java.util.Scanner;

public class P10_PyramidPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = input.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

