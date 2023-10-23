import java.util.HashMap;
import java.util.Scanner;
//Program to find longest substring without repetition.
public class LongestSubstringWithoutRepetition {
    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        int start = 0;
        int maxLen = 0;
        int maxStart = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String :: ");
        String input = sc.nextLine();
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring without repetition: " + longestSubstring);
    }
}
