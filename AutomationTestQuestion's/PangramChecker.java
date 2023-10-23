import java.util.HashSet;
//Program to check panagram java 
public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Create a HashSet to store unique letters encountered in the input
        HashSet<Character> letters = new HashSet<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is an alphabet letter (a to z)
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        // Check if there are 26 unique letters in the HashSet (one for each alphabet letter)
        return letters.size() == 26;
    }
}
