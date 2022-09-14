package function_overloading;

import java.util.Scanner;

import functions.fibonacci;



public class cube {

	
	int cube1 (int x)
	{
		return x * x * x;	
	}

	double cube1 (double y)
	{
		return y * y * y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		cube c1 = new cube();
		int result_int = c1.cube1(x);
		
		
		
		System.out.println("Enter a number with decimal...");
		double y = sc.nextDouble();
		 
		double result_double = c1.cube1(y);
		
		System.out.println("Cube of integer is "+result_int);
		System.out.println("Cube of double is "+result_double);

	}

}
