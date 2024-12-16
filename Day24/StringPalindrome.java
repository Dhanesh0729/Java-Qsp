package Day24;
import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }

        if (s.equalsIgnoreCase(res)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
