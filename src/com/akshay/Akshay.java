package com.akshay;

public class Akshay {

    // (psvm) command is a shortcut of public static void main()
    public static void main(String[] args) {
        // (sout) command is a shortcut of System.out.println()
        System.out.println("How Are You?");
        sayGood();
        Akshay.iAm();
    }

    // (Fine not print because it not main function)
    public static void sayFine() {
        System.out.println("I Am Fine");
    }

    // (Good print because it called by main function)
    private static void sayGood() {
        System.out.println("I Am Good");
    }

    private static void iAm() {
        System.out.println("I Am also fine");
    }
}

