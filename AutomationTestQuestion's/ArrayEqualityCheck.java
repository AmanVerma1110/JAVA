import java.util.Arrays;
//Program to check the quality of two arrays java ?

public class ArrayEqualityCheck {
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        // Check if the arrays are the same length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Use Arrays.equals to compare the elements of both arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};
        
        boolean isEqual = areArraysEqual(array1, array2);

        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
