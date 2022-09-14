package functions;

import java.util.Scanner;

public class swap {
	
	void swap_no(int a, int b)
	{
		System.out.println("Data before swapping..");
		System.out.println(a);
		System.out.println(b);
		
		int temp = a;
		a = b;
		b = temp;

		System.out.println("Data after swapping..");
		System.out.println(a);
		System.out.println(b);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 numbers...");
		int x = sc.nextInt();
		int y = sc.nextInt();
		swap c1 = new swap();
		c1.swap_no(x,y);
		

	}

}
