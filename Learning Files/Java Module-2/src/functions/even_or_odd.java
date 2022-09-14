package functions;

import java.util.Scanner;

public class even_or_odd {

	boolean even_odd (int x)
	{
		if (x % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		even_or_odd c1 = new even_or_odd();
		boolean result = c1.even_odd(x);
		
		if (result)
			System.out.println("Even");
		else
			System.out.println("odd");
		
		
		
	
	}

}
