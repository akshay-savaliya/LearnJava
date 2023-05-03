package Akshay;

import java.util.Scanner;

public class Encode_Decoder {

    public static int encoder(String str) {

        int str1 = 0;
        for (int i = 0; i < str.length(); i++) {
            str1 = str1 + str.charAt(i) * '@';
        }
        return str1;
    }

//    public static String decode(int str) {
//        String str1 = null;
//    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Message : ");
        String str = input.nextLine();

        int encode = encoder(str);
        System.out.println(encode);    // perfect work.


    }
}
