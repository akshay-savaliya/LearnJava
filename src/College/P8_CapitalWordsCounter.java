package College;

import java.util.Scanner;

public class P8_CapitalWordsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int count = 0;
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }
        System.out.println("Number of words starting with a capital letter: " + count);
    }
}

