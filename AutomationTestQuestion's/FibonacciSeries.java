//Program to generate Fibonacci series in java ?
//1.Using Recursion:
public class FibonacciSeries {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to adjust the number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

//Using a Loop (Iterative Approach):
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change this value to adjust the number of Fibonacci numbers to generate
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci Series (Iterative):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}

