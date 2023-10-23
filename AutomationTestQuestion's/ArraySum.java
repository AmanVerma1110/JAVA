//Program to find sum of elements in array.
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = calculateSum(arr);

        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
