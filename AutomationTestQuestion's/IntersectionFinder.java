import java.util.*;
//Program to find intersection of elements into arrays in java.

public class IntersectionFinder {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        Set<Integer> set = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();

        // Add elements from array1 to the set
        for (int num : array1) {
            set.add(num);
        }

        // Check for intersection with elements from array2
        for (int num : array2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Print the intersection
        if (intersection.isEmpty()) {
            System.out.println("No intersection found.");
        } else {
            System.out.print("Intersection: ");
            for (int num : intersection) {
                System.out.print(num + " ");
            }
        }
    }
}
