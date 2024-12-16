package Day15;
import java.util.*;

public class UserControlledSum {
    static int num1 ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean check = true;
        int sum = 0;
        String list = "";

        do {
            System.out.print("Enter the number");
            int num = sc.nextInt();
            sum += num;
            list = list+ " " +num;
            System.out.println("Enter the your choice \n Y/N");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                check = true;
            }
            else if (check) {
                check = false;
            }
        } while (check);
        System.out.print("The Numbers which are entered by the User is"+list);
        System.out.print("The sum of the total number is"+sum);
    }
}
