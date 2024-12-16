package Day24;
import java.util.*;

public class ReplaceLetterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        System.out.println("Enter a Letter : ");
        char c1 = sc.nextLine().charAt(0);
        System.out.println("Enter a Replacing Letter : ");
        char c2 = sc.nextLine().charAt(0);

        char[] ch1 = s1.toCharArray();

        for (int i = 0; i < s1.length(); i++) {
            if (ch1[i]==c1) {
                ch1[i] = c2;
            }
        }
        System.out.println(ch1);
        sc.close();
    }
}
