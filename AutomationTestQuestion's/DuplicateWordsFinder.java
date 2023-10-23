import java.util.*;

//Program to find duplicate words in a given strings
public class DuplicateWordsFinder {
    public static void main(String[] args) {
        String inputString = "This is a test. This is only a test, my friend.";
        List<String> duplicates = findDuplicateWords(inputString);
        
        System.out.println("Duplicate words: " + duplicates);
    }
    
    public static List<String> findDuplicateWords(String inputString) {
        // Split the input string into words
        String[] words = inputString.split("\\s+"); // Split on whitespace
        
        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Create a List to store duplicate words
        List<String> duplicateWords = new ArrayList<>();
        
        for (String word : words) {
            // Remove punctuation and convert to lowercase for case-insensitive comparison
            String cleanWord = word.replaceAll("[.,!?]", "").toLowerCase();
            
            // If the word is already in the map, increment its count
            if (wordCount.containsKey(cleanWord)) {
                wordCount.put(cleanWord, wordCount.get(cleanWord) + 1);
            } else {
                // Otherwise, add it to the map with a count of 1
                wordCount.put(cleanWord, 1);
            }
        }
        
        // Iterate through the map and find duplicate words
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWords.add(entry.getKey());
            }
        }
        
        return duplicateWords;
    }
}
