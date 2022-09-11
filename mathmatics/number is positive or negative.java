import java.util.Scanner;

public  class PositiveNegative{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number:: ");

        int num = in.nextInt();

        if(num>0){
            System.out.println("Enter number is Positive");
        }
        else{
            System.out.println("Enter number is Negative");
        }
    }
}
