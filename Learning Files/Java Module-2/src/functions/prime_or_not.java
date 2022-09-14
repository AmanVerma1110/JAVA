package functions;

import java.util.Scanner;

public class prime_or_not {
	boolean prime(int x)
	{
		boolean prime_no = true;
		
		for (int i = 2; i < x/2; ++i)
			if (x % i == 0)
				prime_no = false;
		
		return prime_no;
			
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		prime_or_not c1 = new prime_or_not();
		boolean result = c1.prime(x);
		if (result)
			System.out.println("Prime number...");
		else
		    System.out.println("Not a prime number...");
		

	}

}
