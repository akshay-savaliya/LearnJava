package Patterns;

public class Triangle_0_1 {
    public static void main(String[] args) {

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//        sol:
//        ___________
//        |1| | | | |    (1,1)    1 -> sum ---> 2
//        |0|1| | | |    (2,1),(2,2)    1 -> sum ---> 4    0 -> sum ---> 3
//        |1|0|1| | |    (3,1),(3,2),(3,3)    1 -> sum ---> 4,6    0 -> sum ---> 5
//        |0|1|0|1| |    (4,1),(4,2),(4,3),(4,4)    1 -> sum ---> 6,8    0 -> sum ---> 5,7
//        |1|0|1|0|1|    (5,1),(5,2),(5,3),(5,4),(5,5)    1 -> sum ---> 6,8,10    0 -> sum ---> 7,9
//        -----------

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
