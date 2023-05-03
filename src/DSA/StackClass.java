package DSA;
public class StackClass {

//    Implementation
//    -> Array ---> Fixed Size
//    -> ArrayList
//    -> Linked List

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public Node head;
    }



    public static void main(String[] args) {
    }
}
