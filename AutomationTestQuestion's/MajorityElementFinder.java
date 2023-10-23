import java.util.Scanner;

//Program to find majority elements in an array java ?

public class MajorityElementFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int majorityElement = findMajorityElement(arr);
        if (isMajorityElement(arr, majorityElement)) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }

    // Function to find the majority element in an array
    public static int findMajorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }

        return candidate;
    }

    // Function to check if the given element is a majority element in the array
    public static boolean isMajorityElement(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}
