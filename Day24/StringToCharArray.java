package Day24;
import java.util.*;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        char[] ch = new char[s.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        System.out.println(s);
        System.out.println(Arrays.toString(ch));

        //Builtin Function to 
        System.out.println(Arrays.toString(s.toCharArray()));
        sc.close();
    }
}
