package Day24;
import java.util.*;

public class a2b3_aabbb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i+=2) {
            for (int j = 0; j < (s.length()+1)-48; j++) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
        sc.close();
    }
}