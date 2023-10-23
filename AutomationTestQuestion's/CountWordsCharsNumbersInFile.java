import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Program to find numbers of words characters and number in a given text file. ?

public class CountWordsCharsNumbersInFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\95002526\\Documents\\hello.txt"; // Replace with the path to your text file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int wordCount = 0;
            int charCount = 0;
            int numberCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words
                charCount += line.length();

                for (String word : words) {
                    wordCount++;
                    if (word.matches(".*\\d+.*")) {
                        // Check if the word contains a number
                        numberCount++;
                    }
                }
            }

            reader.close();

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of numbers: " + numberCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
