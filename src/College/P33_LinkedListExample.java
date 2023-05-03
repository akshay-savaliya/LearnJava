package College;

import java.util.LinkedList;

public class P33_LinkedListExample {
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> list = new LinkedList<String>();

        // Add elements to the linked list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Print the linked list
        System.out.println("Initial linked list: " + list);

        // Add an element at the beginning of the linked list
        list.addFirst("Start");

        // Add an element at the end of the linked list
        list.addLast("End");

        // Remove an element from the linked list
        list.remove("C");

        // Print the modified linked list
        System.out.println("Modified linked list: " + list);
    }
}

