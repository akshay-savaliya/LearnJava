package College;

import java.util.Random;

public class P12_PlateNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder plateNumber = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char letter = (char) (rand.nextInt(26) + 'A');
            plateNumber.append(letter);
        }
        for (int i = 0; i < 4; i++) {
            int digit = rand.nextInt(10);
            plateNumber.append(digit);
        }
        System.out.println("Generated plate number: " + plateNumber);
    }
}

