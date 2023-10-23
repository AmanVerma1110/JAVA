public class EvenOddNumbers {
	//Program to Print even and odd number in an array java ?
    public static void printEvenAndOddNumbers(int[] arr) {
        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printEvenAndOddNumbers(numbers);
    }
}
