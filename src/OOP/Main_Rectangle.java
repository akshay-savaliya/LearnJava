package OOP;

import java.util.Scanner;

public class Main_Rectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];    // null, null, null

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter the width and height? (y/n)");
            char choice = input.next().charAt(0);    // y/n
            if (choice == 'y') {
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            } else {
                rectangles[i] = new Rectangle();
            }
        }

        System.out.println("The rectangles are : ");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(
                    "Rectangle " + (i + 1) +
                            " : Width: " + rectangles[i].getWidth() +
                            ", Height: " + rectangles[i].getHeight());
        }
    }
}
