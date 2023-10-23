//Program to find the largest & smallest numbers in an array.
public class LargestSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 2, 1, 5, 8, 3, 6};

        int largest = findLargestNumber(arr);
        int smallest = findSmallestNumber(arr);

        System.out.println("Largest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);
    }

    public static int findLargestNumber(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int findSmallestNumber(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }
}
