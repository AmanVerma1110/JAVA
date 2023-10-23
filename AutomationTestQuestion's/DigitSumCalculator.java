import java.util.Scanner;
//Program to count sum of digits in a number.
public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        long digitSum = calculateDigitSum(number);

        System.out.println("Sum of digits in the number: " + digitSum);
    }

    public static long calculateDigitSum(long number) {
        long sum = 0;

        // Take the absolute value of the number to handle negative numbers
        number = Math.abs(number);

        while (number != 0) {
            long digit = number % 10; // Get the last digit
            sum += digit; // Add the last digit to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}
