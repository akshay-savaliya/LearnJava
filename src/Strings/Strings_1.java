package Strings;

public class Strings_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

//        char at index 0
        System.out.println(sb.charAt(0));

//        set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

//        delete char at index
        sb.delete(0, 1);
        System.out.println(sb);

//        insert char at index
        sb.insert(0, 'T');
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("H");
        System.out.println(sb1);
        sb1.append("e");
        System.out.println(sb1);
        sb1.append("ll");
        System.out.println(sb1);
        sb1.append("o");
        System.out.println(sb1);
        System.out.println(sb1.length());

//        Reverse String

        for (int i = 0; i < sb1.length() / 2; i++) {
            int front = i;
            int back = sb1.length() - i - 1;    // for i=0 ---> 5-0-1 = 4

            char frontChar = sb1.charAt(front);
            char backChar = sb1.charAt(back);

            sb1.setCharAt(front, backChar);
            sb1.setCharAt(back, frontChar);
        }
        System.out.println(sb1);
    }
}
