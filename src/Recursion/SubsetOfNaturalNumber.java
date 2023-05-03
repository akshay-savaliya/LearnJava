package Recursion;

import java.util.ArrayList;

public class SubsetOfNaturalNumber {

//    print all the subsets of a set of first n natural numbers.
//    EX:
//    n = 3 ---> {(1,2,3), (1,2), (1,3), (2,3), (1), (2), (3), ()}

    public static void printSubset(ArrayList<Integer> subset) {
//        for (int i = 0; i < subset.size(); i++) {
//            System.out.print(subset.get(i) + " ");
//        }
        System.out.println(subset);
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
            return;
        }

//        add
        subset.add(n);
        findSubsets(n - 1, subset);

//        not add
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);

    }


    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
