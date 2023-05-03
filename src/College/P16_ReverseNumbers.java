package College;

import java.util.Scanner;

public class P16_ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        reverse(numbers);

        System.out.print("Reversed numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void reverse(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }
}

