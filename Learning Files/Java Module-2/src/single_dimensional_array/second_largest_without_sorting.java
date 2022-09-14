package single_dimensional_array;

import java.util.Scanner;

public class second_largest_without_sorting {

	public static void main(String[] args) {
		int a[] = new int [5];
		 
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < 5; ++i)
		{
		  System.out.println("Enter a number...");
		  a[ i] = sc.nextInt();
		}
		int temp;
		
		int large=a[0];
		for (int i = 1; i < 5; ++i)
		{
			if (a [i] > large)
				large = a[i];
		}
		
		int sec_large=a[0];
		
		for (int i = 0; i < 5; ++i)
		{
           if (a[i] != large && a[i] > sec_large)
        	   sec_large = a [i];
		}
		
		System.out.println("Second largest is..."+sec_large);


	}

}
