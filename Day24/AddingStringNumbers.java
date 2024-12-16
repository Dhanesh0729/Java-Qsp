package Day24;
import java.util.*;
public class AddingStringNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                sum = sum + ((int)s.charAt(i)-48);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
