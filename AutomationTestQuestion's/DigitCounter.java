import java.util.Scanner;

//Program to count digits in a number.

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        int digitCount = countDigits(number);
        System.out.println("Number of digits in the number: " + digitCount);
    }

    public static int countDigits(long number) {
        // Convert the number to a string and find its length
        String numberStr = Long.toString(number);
        return numberStr.length();
    }
}
