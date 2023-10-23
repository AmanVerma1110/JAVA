import java.util.Scanner;

//Program to get the first letter of each word string.

public class FirstLetterOfEachWord {
    public static String getFirstLetters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+"); // Split the string into words using whitespace as a delimiter

        for (String word : words) {
            if (!word.isEmpty()) { // Check if the word is not empty
                result.append(word.charAt(0)); // Append the first character of the word
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String :: ");
        String input = sc.nextLine();
        String firstLetters = getFirstLetters(input);
        System.out.println("First letters of each word: " + firstLetters);
    }
}
