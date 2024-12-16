package Day24;
import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String UC = "";
        String LC = "";
        String res = "";


        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='A' && ch[i]<='Z') {
                UC += ch[i];
            }
            else if (ch[i]>='a' && ch[i]<='z') {
                LC += ch[i];
            }
        }

        for (int i = 0,m = 0,n = 0; i < ch.length; i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                res += UC.charAt(m);
                m++;
            }
            else if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                res += LC.charAt(n);
                n++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
