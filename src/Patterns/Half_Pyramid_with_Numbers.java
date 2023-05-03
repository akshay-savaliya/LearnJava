package Patterns;

public class Half_Pyramid_with_Numbers {
    public static void main(String[] args) {

//        1
//        12
//        123
//        1234
//        12345

        int n = 5;

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

//        OR

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
