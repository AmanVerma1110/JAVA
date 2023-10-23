public class PyramidPattern {
	//Program to print pyramid pattern of numbers?
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Print decreasing numbers (inverted)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
