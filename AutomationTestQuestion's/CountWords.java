//Program to count the number of words in a given string java ?
public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+"); // Split the string into words using whitespace as a delimiter
        return words.length;
    }

    public static void main(String[] args) {
        String input = "This is a sample string with seven words.";
        int wordCount = countWords(input);

        System.out.println("Number of words in the string: " + wordCount);
    }
}
