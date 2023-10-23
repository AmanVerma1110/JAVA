//Program to reverse a string without using loops and build-in functions java ?
public class StringReversal {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            char firstChar = str.charAt(0);
            String restOfString = str.substring(1);
            return reverseString(restOfString) + firstChar;
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversedString = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}