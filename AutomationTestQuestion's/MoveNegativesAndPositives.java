//Program to move all negative number in start of array & +ve number in end of an array. java ?
public class MoveNegativesAndPositives {
    public static void moveNegativesAndPositives(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move right pointer to the left until a negative number is found
            while (arr[left] < 0 && left < right) {
                left++;
            }

            // Move left pointer to the right until a positive number is found
            while (arr[right] >= 0 && left < right) {
                right--;
            }

            // Swap the negative and positive numbers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {-2, 5, -1, 3, -8, 4, 7, -6};
        moveNegativesAndPositives(array);

        System.out.print("Array with negatives at the start and positives at the end: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
