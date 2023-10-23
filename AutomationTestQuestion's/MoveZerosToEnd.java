//Program to move all zero to end of array.
public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroCount = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroCount] = arr[i];
                nonZeroCount++;
            }
        }

        // Fill the remaining elements with zeros
        for (int i = nonZeroCount; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12, 0, 7, 0, 0, 8};
        moveZerosToEnd(array);

        System.out.print("Array with zeros moved to the end: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
