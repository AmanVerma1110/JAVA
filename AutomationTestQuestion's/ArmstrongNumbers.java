import java.util.Scanner;

// Program to find Armstrong number.
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range start: ");
        int start = scanner.nextInt();
        System.out.print("Enter the range end: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}
