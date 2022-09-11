import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {

        // Create scanner class object
        Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();


        // Perform arithmetic operations.
        int add 	= num1 + num2;
        int sub 	= num1 - num2;
        int mult 	= num1 * num2;
        int div	= num1 / num2;



        // Print result to console.
        System.out.println("Addition : "         + add);
        System.out.println("Subtraction : "  + sub);
        System.out.println("Multiplication : "     + mult);
        System.out.println("Division : "    + div);

        //USe of  Increment operator
        System.out.println("Increment operator : Num1 "+ ++num1 +" Num2 " + ++num2);
        //USe of  Decrement operator
        System.out.println("Decrement operator : Num1 "+ --num1 +" Num2 " + --num2);


    }
}
