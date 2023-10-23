//Program to reverse each word in a given string java?
public class ReverseWords {
    public static String reverseEachWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+"); // Split the string into words using whitespace as a delimiter
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the reversed string
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String input = "This is a sample string";
        String reversedWords = reverseEachWord(input);

        System.out.println("String with reversed words: " + reversedWords);
    }
}
