package single_dimensional_array;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
	 int a[] = new int [5];
	 
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < 5; ++i)
		{
		  System.out.println("Enter a number...");
		  a[ i] = sc.nextInt();
		}
		
		int large=a[0];
		for (int i = 1; i < 5; ++i)
		{
			if (a [i] > large)
				large = a[i];
		}
		
		System.out.println("Largest is "+large);
	 

	}

}
