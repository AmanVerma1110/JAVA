public class SubstringGenerator {
	//Program to print all sub strings for a given strings java ?
    public static void printAllSubstrings(String input) {
        int n = input.length();

        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                String substring = input.substring(start, end);
                System.out.println(substring);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All substrings of '" + input + "':");
        printAllSubstrings(input);
    }
}
