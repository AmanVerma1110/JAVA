//Program for Stack implementation using two array in java.
public class TwoArrayStack {
    private int[] data;
    private int[] top;
    private int capacity;
    private int size;

    public TwoArrayStack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        top = new int[2];
        top[0] = -1; // Top of the first stack
        top[1] = capacity; // Top of the second stack
        size = 0;
    }

    public void push(int stackNumber, int value) {
        if (size >= capacity) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }

        if (stackNumber == 0) {
            if (top[0] < top[1] - 1) {
                top[0]++;
                data[top[0]] = value;
                size++;
            } else {
                System.out.println("Stack 0 is full. Cannot push.");
            }
        } else if (stackNumber == 1) {
            if (top[1] > top[0] + 1) {
                top[1]--;
                data[top[1]] = value;
                size++;
            } else {
                System.out.println("Stack 1 is full. Cannot push.");
            }
        } else {
            System.out.println("Invalid stack number.");
        }
    }

    public int pop(int stackNumber) {
        int value = -1; // Default value for an empty stack

        if (stackNumber == 0) {
            if (top[0] >= 0) {
                value = data[top[0]];
                top[0]--;
                size--;
            } else {
                System.out.println("Stack 0 is empty. Cannot pop.");
            }
        } else if (stackNumber == 1) {
            if (top[1] < capacity) {
                value = data[top[1]];
                top[1]++;
                size--;
            } else {
                System.out.println("Stack 1 is empty. Cannot pop.");
            }
        } else {
            System.out.println("Invalid stack number.");
        }

        return value;
    }

    public int peek(int stackNumber) {
        int value = -1; // Default value for an empty stack

        if (stackNumber == 0 && top[0] >= 0) {
            value = data[top[0]];
        } else if (stackNumber == 1 && top[1] < capacity) {
            value = data[top[1]];
        }

        return value;
    }

    public boolean isEmpty(int stackNumber) {
        if (stackNumber == 0) {
            return top[0] == -1;
        } else if (stackNumber == 1) {
            return top[1] == capacity;
        } else {
            System.out.println("Invalid stack number.");
            return false;
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        TwoArrayStack stack = new TwoArrayStack(6);

        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(1, 11);
        stack.push(1, 12);

        System.out.println("Stack 0 Peek: " + stack.peek(0)); // Should print 2
        System.out.println("Stack 1 Peek: " + stack.peek(1)); // Should print 12

        System.out.println("Stack 0 Pop: " + stack.pop(0)); // Should print 2
        System.out.println("Stack 1 Pop: " + stack.pop(1)); // Should print 12

        System.out.println("Is Stack 0 empty? " + stack.isEmpty(0)); // Should print true
        System.out.println("Is Stack 1 empty? " + stack.isEmpty(1)); // Should print true

        System.out.println("Stack Size: " + stack.size()); // Should print 2
    }
}
