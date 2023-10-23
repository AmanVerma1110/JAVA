public class RemoveWhiteSpace {
	//Program to remove white spaces in string.
    public static String removeWhiteSpace(String input) {
        // Use a regular expression to match one or more white space characters
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "This is a test string with spaces and\ttabs.";

        String result = removeWhiteSpace(input);

        System.out.println("Original String: " + input);
        System.out.println("String with white spaces removed: " + result);
    }
}
