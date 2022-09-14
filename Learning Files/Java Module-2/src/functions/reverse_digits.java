package functions;

import java.util.Scanner;

public class reverse_digits {

	int reverse(int x)
	{
		int rem, rev=0;

		for (;x > 0; x = x / 10)
		{
			rem = x % 10;
			rev = rev * 10 + rem;

		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();

		reverse_digits c1 = new reverse_digits();
		int result = c1.reverse(x);
		System.out.println("Reveresed digits of a given number is "+result);

	}

}
