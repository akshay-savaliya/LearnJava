package DSA;

import java.util.LinkedList;

public class LL_CollectionsFramework {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        list.addLast("a");
        list.addLast("Collection Framework.");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
