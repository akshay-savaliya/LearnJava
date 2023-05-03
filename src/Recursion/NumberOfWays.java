package Recursion;

public class NumberOfWays {

//    Find the number of ways in which you can invite n people to your party, single or in pair.
//    EX:
//    n=1 ---> 1 ---> 1
//    n=2 ---> (1,2), (1-2) ---> 2
//    n=3 ---> (1,2,3), (1-2,3), (1-3,2), (1,2-3) ---> 4

    public static int callGuests(int n) {

        if (n <= 1) {
            return 1;
        }

//        single
        int way1 = callGuests(n - 1);

//        pair
        int way2 = (n - 1) * callGuests(n - 2);    // (n-1) -> way to pair,  and (n-2) -> extra ---> (1-2,3), (1-3,2), (1,2-3)

        return way1 + way2;
    }

    public static void main(String[] args) {

        int n = 4;
        int totalWays = callGuests(n);
        System.out.println(totalWays);

    }
}
