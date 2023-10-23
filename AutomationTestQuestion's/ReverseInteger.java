import java.util.Scanner;
//Program to reverse integer in JAVA.
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);
        System.out.println("Reversed integer: " + reversedNumber);
    }

    // Function to reverse an integer
    public static int reverseInteger(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
