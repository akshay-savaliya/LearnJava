package College;

import java.util.Scanner;

public class P7_StringHalfPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int length = str.length();
        int mid = length / 2;

        System.out.println("Length of the string: " + length);
        System.out.println("Second half of the string: " + str.substring(mid));
    }
}

