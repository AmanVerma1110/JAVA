package multi_dimensional_array;

import java.util.Scanner;

public class add_all_elements {
	public static void main(String[] args) {
	int a[][] = new int[2][2];
	int sum=0;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter 4 elements for matrix-A");
	for (int i = 0; i < 2; ++i)
		for (int j = 0; j < 2; ++j)
		{
			System.out.println("Enter a number...");
			a[i][j] = sc.nextInt();
		}
	
	for (int i = 0; i < 2; ++i)
		for (int j = 0; j < 2; ++j)
		{
			 
			sum = sum + a[i][j];
		}
	
	System.out.println("Sum of matrix is "+sum);
	}

}
