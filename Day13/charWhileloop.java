package Day13;
import java.util.*;
public class charWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        int count = 1;
        while (ch<='Z') {
            System.out.println(ch);
            ch++;
            count++;
        }
    }
}
