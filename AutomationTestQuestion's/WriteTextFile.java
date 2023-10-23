import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Replace with the path to your output text file

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            String textToWrite = "This is the text to write to the file.";

            writer.write(textToWrite);
            writer.newLine(); // Add a newline character to separate lines
            writer.close();
            
            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
