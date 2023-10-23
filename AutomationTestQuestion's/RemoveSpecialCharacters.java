public class RemoveSpecialCharacters {
	//Program to remove junk or special characters in string java ?
    public static String removeSpecialCharacters(String input) {
        // Use a regular expression to match any character that is not a letter or a digit
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        String input = "Hello, World! This is a test string #123.";

        String result = removeSpecialCharacters(input);

        System.out.println("Original String: " + input);
        System.out.println("String with special characters removed: " + result);
    }
}
