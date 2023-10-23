import java.util.Scanner;
//Program to count even odd digit in a number.
public class EvenOddDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        int[] evenOddCount = countEvenOddDigits(number);

        System.out.println("Number of even digits: " + evenOddCount[0]);
        System.out.println("Number of odd digits: " + evenOddCount[1]);
    }

    public static int[] countEvenOddDigits(long number) {
        int evenCount = 0;
        int oddCount = 0;

        while (number != 0) {
            long digit = number % 10; // Get the last digit
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10; // Remove the last digit
        }

        int[] counts = { evenCount, oddCount };
        return counts;
    }
}
