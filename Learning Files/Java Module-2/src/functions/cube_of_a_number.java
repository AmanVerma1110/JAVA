package functions;

import java.util.Scanner;

public class cube_of_a_number {
	
	int cube (int x)
	{
		return x * x * x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		cube_of_a_number c1 = new cube_of_a_number();
		int result = c1.cube(x);
		System.out.println("Cube of the given number is "+result);
		
		
		
	
	}

}
