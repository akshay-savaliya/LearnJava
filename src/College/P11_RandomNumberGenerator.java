package College;

import java.util.Random;

public class P11_RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 100; i++) {
            int randomNumber = rand.nextInt(49) + 1;
            System.out.print(randomNumber + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}

