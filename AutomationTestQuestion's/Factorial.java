import java.util.Scanner;

//Program to find factorial of a number.
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = findFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Function to find the factorial of a number
    public static long findFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
