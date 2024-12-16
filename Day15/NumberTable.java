package Day15;
import java.util.*;

public class NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        Boolean check = true;
        do {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n +" X "+ i + " = "+ n*i);
            }
            System.out.println("Wanna Continue? \n Y/N");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                check=false;
            }
            else if(ch == 'y' || ch == 'Y'){
                System.out.print("Enter another number : ");
                n = sc.nextInt();
                check = true;
            }
        } while (check);
    }
}
