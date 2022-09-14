package functions;

import java.util.Scanner;

public class factorial {
	int factor (int x)
	{
		int fact = 1;
		for (int i = 1; i <= x; ++ i)
			fact = fact * i;
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		factorial c1 = new factorial();
		int result = c1.factor(x);
		System.out.println("factorial of a given number is "+result);
		
		
		
	
	}

}
