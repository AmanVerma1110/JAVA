import java.util.Scanner;

public class Arreys {


    public static void main(String[] args) {
        int idsArray[] = new int[5];
        int salaryArray[] = new int[5];
        String nameArray[] = new String[5];
        String name=" ";
        Arreys emp = new Arreys();
        for (int i = 0; i <= 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter employee id: ");
            idsArray[i] = sc.nextInt();
            System.out.print("Enter employee name: ");
            nameArray[i] = sc.next();
            System.out.print("Enter employee salary: ");
            salaryArray[i] = sc.nextInt();
        }
        display(idsArray, nameArray, salaryArray);
        display(idsArray, nameArray);
        display(name, idsArray, nameArray, salaryArray);

    }

    static void display(int[] idsArray, String[] nameArray, int[] salaryArray) {
        System.out.println("ID"+"   " +"Name"+"   "+"Salary");
        for (int i = 0; i <= 4; i++) {
            System.out.println(idsArray[i] + "   " + nameArray[i] + "   " + salaryArray[i]);
            System.out.println();
        }
    }

    static void display(int[] idsArray, String[] nameArray) {
        System.out.println("IDS"+"   " +"Name");
        for (int i = 0; i <= 4; i++) {
            System.out.println(idsArray[i] + "   " + nameArray[i]);
            System.out.println();
        }
    }
    static void display(String name, int[] idsArray, String[] nameArray, int[] salaryArray) {
        System.out.println("Enter the name ::");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("ID"+"   " +"Name"+"   "+"Salary");
        for (int i = 0; i <= 4; i++) {
            if(nameArray[i].equalsIgnoreCase(name))
            {
                System.out.println(idsArray[i] + "   " + nameArray[i] + "   " + salaryArray[i]);
                System.out.println();
            }

        }
    }
}
