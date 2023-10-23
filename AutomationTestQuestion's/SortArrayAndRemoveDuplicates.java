import java.util.Arrays;
import java.util.HashSet;

//Program sorting an array in ascending order by removing duplicates.

public class SortArrayAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 9, 6, 5, 8, 2, 1, 7, 9};
        
        int[] sortedArray = sortAndRemoveDuplicates(inputArray);
        
        System.out.println("Sorted array without duplicates:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortAndRemoveDuplicates(int[] inputArray) {
        // Use a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();

        // Iterate through the input array and add elements to the HashSet
        for (int num : inputArray) {
            uniqueElements.add(num);
        }

        // Convert the HashSet back to an array
        int[] sortedArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            sortedArray[index++] = num;
        }

        // Sort the resulting array in ascending order
        Arrays.sort(sortedArray);

        return sortedArray;
    }
}
