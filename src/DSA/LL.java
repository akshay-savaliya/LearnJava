package DSA;


public class LL {

    Node head;

    private int size;
    LL() {
        this.size = 0;
    }


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

//    Add -> first, last

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

//    Delete -> first, last

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //    Reverse
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

//            update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //    print
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("List.");
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());

//        reverse
        LL list1 = new LL();
        list1.addLast("1");
        list1.addLast("2");
        list1.addLast("3");
        list1.addLast("4");
        list1.printList();

        list1.reverseIterate();
        list1.printList();

    }
}
