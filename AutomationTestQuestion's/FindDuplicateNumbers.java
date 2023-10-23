import java.util.HashSet;

//Program to find duplicate numbers in JAVA array.
public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 6, 2, 7, 8, 4};

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        System.out.print("Duplicate numbers in the array: ");
        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        for (int duplicate : duplicates) {
            System.out.print(duplicate + " ");
        }
    }
}
