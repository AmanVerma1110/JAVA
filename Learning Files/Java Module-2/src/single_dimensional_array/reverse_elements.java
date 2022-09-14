package single_dimensional_array;

import java.util.Scanner;

public class reverse_elements {

	public static void main(String[] args) {
		 int a[] = new int [5];
		 
			Scanner sc = new Scanner (System.in);
			for (int i = 0; i < 5; ++i)
			{
			  System.out.println("Enter a number...");
			  a[ i] = sc.nextInt();
			}
			int temp;

			for (int i = 0; i < 5/2; ++i)
			{
				temp = a[i];
				a[i] = a [5-i-1];
				a[5-i-1] = temp;
				

			}
			
			System.out.println("Reversed data is...");
			for (int i = 0; i < 5; ++i)
			{
			   System.out.println(a[i]); 
			 
			}

	}

}
