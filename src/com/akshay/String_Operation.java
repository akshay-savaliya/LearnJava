package com.akshay;

public class String_Operation {
    public static void main(String[] args) {
        String h1 = "Hello";
        String h2 = "World";
        String h3 = "";


        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h1.toUpperCase());
        System.out.println(h2.toLowerCase());
        System.out.println(h1.length());
        System.out.println(h2.length());
        System.out.println(h3.isEmpty());
        System.out.println(h2.isBlank());
        System.out.println(h1.charAt(1));
        System.out.println(h1.indexOf('w'));
        System.out.println(h2.indexOf('l'));
        System.out.println(h1.concat(h2));
        System.out.println(h1+" "+h2);
        System.out.println("My favorite number is : " + 100);
/*                          ^
                            |
                            |
                            |
        Automatically converts 100 to "100"
        System.out.println("My favorite number is : " + "100");
*/

        System.out.println("My favorite number is : " + 60 + 40);
/*                          ^
                            |
                            |
                            |
        Automatically converts 60 to "60"
        System.out.println("My favorite number is : 60" + 40);
                            ^
                            |
                            |
                            |
        Automatically converts 40 to "40"
        System.out.println("My favorite number is : 6040");
 */
        System.out.println("My favorite number is : " + (60 + 40));

        System.out.println("My name is Akshay ".concat("Savaliya."));
    }
}
