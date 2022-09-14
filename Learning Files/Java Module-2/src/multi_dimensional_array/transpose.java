package multi_dimensional_array;

import java.util.Scanner;

public class transpose {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		
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
				 
				b[j][i] = a[i][j];
			}
		
		System.out.println("Transposed matrix...");
		for (int i = 0; i < 2; ++i)
		{
			for (int j = 0; j < 2; ++j)
			{				
				System.out.print(b[i][j] + " ");
			}
			System.out.println();	
		}

	}

}
