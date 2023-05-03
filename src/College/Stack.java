package College;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to insert an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow.");
            return;
        }

        arr[++top] = element;
        System.out.println(element + " has been pushed onto the stack.");
    }

    // Pop method to remove an element from the top of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow.");
            return -1;
        }

        int element = arr[top--];
        System.out.println(element + " has been popped from the stack.");
        return element;
    }

    // Peek method to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow.");
            return -1;
        }

        System.out.println("Top element of the stack is " + arr[top] + ".");
        return arr[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.peek();
        stack.pop();
        stack.peek();
    }
}

