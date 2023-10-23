//Program to count number of vowels in a given string java ?
public class CountVowels {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello, World!"; // Example input string
        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
