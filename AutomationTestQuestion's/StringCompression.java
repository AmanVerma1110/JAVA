//Program for string compression.

public class StringCompression {
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        // Check if the compressed string is shorter than the original string
        if (compressed.length() >= input.length()) {
            return input;
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbcccccddeee";
        String compressedString = compressString(input);
        System.out.println("Compressed string: " + compressedString);
    }
}
