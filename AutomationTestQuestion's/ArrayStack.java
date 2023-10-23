//Program for Stack implementation using array in java.?
public class ArrayStack {
    private int[] stack;
    private int top; // Index of the top element
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; // Initialize the top index to -1 (empty stack)
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Default value for an empty stack
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Default value for an empty stack
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek()); // Should print 3

        System.out.println("Pop: " + stack.pop()); // Should print 3

        System.out.println("Is Empty? " + stack.isEmpty()); // Should print false

        System.out.println("Size: " + stack.size()); // Should print 2
    }
}
