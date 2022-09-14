package single_dimensional_array;

import java.util.Scanner;

public class search_an_element {

	public static void main(String[] args) {
		 int a[] = new int [5];
		 
			Scanner sc = new Scanner (System.in);
			for (int i = 0; i < 5; ++i)
			{
			  System.out.println("Enter a number...");
			  a[ i] = sc.nextInt();
			}
			
			
			System.out.println("Enter a number to search for");
			int found = 0;
			int search = sc.nextInt();
			int large=a[0];
			for (int i = 1; i < 5; ++i)
			{
				if (a [i] == search)
					found = 1;
			}
			
			if (found == 1)
			  System.out.println("Element found in the array..");
			else
			  System.out.println("Element not found in the array..");

	}

}
