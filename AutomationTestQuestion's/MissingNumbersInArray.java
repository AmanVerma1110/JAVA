import java.util.HashSet;

//Program to finding missing numbers in array.

public class MissingNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int n = 8; // Assuming the array contains numbers from 1 to n

        findMissingNumbers(arr, n);
    }

    public static void findMissingNumbers(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Missing numbers in the array: ");
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
