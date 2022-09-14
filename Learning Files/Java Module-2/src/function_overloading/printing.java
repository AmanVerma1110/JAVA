package function_overloading;

import java.util.Scanner;

public class printing {
	
	void print (int x)
	{
		System.out.println(x);
	}
	
	void print (String y)
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		System.out.println("Enter a String...");
		String str = sc.nextLine();
		
		printing c1 = new printing();
		c1.print(x);
		c1.print(str); 
	}

}
