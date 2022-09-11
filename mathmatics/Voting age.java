import java.util.Scanner;

public  class Voting{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Candidate Age :: ");

        int age = in.nextInt();

        if(age>18){
            System.out.println("Candidate is eligible for voting");
        }
        else{
            System.out.println("candidate is not eligible for voting");
        }
    }
}
