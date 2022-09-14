package functions;

import java.util.Scanner;

public class string_palindrome {
	
	boolean string_pal (String str)
	{
	String str1 = new StringBuilder(str).reverse().toString();
		 
		boolean pal;
 
		
		if (str.equals(str1))
			pal = true;
		else
			pal = false;
 		
		return pal;			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String...");
		String x = sc.next();
		
		string_palindrome c1 = new string_palindrome();
		boolean result = c1.string_pal(x);
		
		if (result)
		  System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");

		 

	}

}
