import java.util.ArrayList;
import java.util.Collections;
//Program to sort elements in an array using build-in methods java ?
public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Cherry");
        stringList.add("Date");

        // Sort the ArrayList in alphabetical order
        Collections.sort(stringList);

        System.out.println("Sorted ArrayList (alphabetical order): " + stringList);
    }
}
