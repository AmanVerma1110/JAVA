import java.util.ArrayList;
import java.util.Collections;
//Program for how to reverse the order of elements in arraylist in java?
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Fig");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Reverse the ArrayList
        Collections.reverse(list);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + list);
    }
}
