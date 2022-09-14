package multi_dimensional_array;

import java.util.Scanner;

public class add_and_subract_matrices {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		int d[][] = new int[2][2];

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 4 elements for matrix-A");
		for (int i = 0; i < 2; ++i)
			for (int j = 0; j < 2; ++j)
			{
				System.out.println("Enter a number...");
				a[i][j] = sc.nextInt();
			}

		System.out.println("Enter 4 elements for matrix-B");
		for (int i = 0; i < 2; ++i)
			for (int j = 0; j < 2; ++j)
			{
				System.out.println("Enter a number...");
				b[i][j] = sc.nextInt();
			}



		for (int i = 0; i < 2; ++i)
			for (int j = 0; j < 2; ++j)
			{

				c[i][j] = a[i][j] + b[i][j];
				d[i][j] = a[i][j] - b[i][j];
			}


		System.out.println("Added values of  matrix A and B");
		for (int i = 0; i < 2; ++i)
		{
			for (int j = 0; j < 2; ++j)
			{				
				System.out.print(c[i][j] + " ");
			}
			System.out.println();	
		}

		
		System.out.println("Subtracted values of  matrix A and B");
		for (int i = 0; i < 2; ++i)
		{
			for (int j = 0; j < 2; ++j)
			{				
				System.out.print(d[i][j] + " ");
			}
			System.out.println();	
		}
	}

}
