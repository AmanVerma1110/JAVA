import java.util.Scanner;

//Program to print count of vowels in string in java.

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String inputString) {
        // Convert the input string to lowercase to perform case-insensitive counting
        inputString = inputString.toLowerCase();

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            // Check if the character is a vowel (a, e, i, o, or u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
