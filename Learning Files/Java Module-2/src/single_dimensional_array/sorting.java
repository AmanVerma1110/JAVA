package single_dimensional_array;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		 int a[] = new int [5];
		 
			Scanner sc = new Scanner (System.in);
			for (int i = 0; i < 5; ++i)
			{
			  System.out.println("Enter a number...");
			  a[ i] = sc.nextInt();
			}
			int temp;

			for (int i = 0; i < 5; ++i)
				for (int j = 0; j < 5; ++j)
				{
					if (a [i] < a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			
			System.out.println("Sorted data is...");
			for (int i = 0; i < 5; ++i)
			{
			  System.out.println(a[i]); 
			 
			}
			
	}

}
