package functions;

import java.util.Scanner;

public class fibonacci {
	
	void fibo(int n)
	{
	int fib1=0;
	int fib2 = 1;
	int fib3;
	System.out.println(fib1);
	System.out.println(fib2);
	
	for (int i = 0; i < n-2; ++i)
	{
		fib3 = fib1 + fib2;
		System.out.println(fib3);
		fib1 = fib2;
		fib2 = fib3;
	}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		fibonacci c1 = new fibonacci();
		c1.fibo(x);
		

	}

}
