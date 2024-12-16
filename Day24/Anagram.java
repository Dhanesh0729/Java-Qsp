package Day24;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = sc.nextLine();
        s1 = s1.toUpperCase();
        System.out.println("Enter String 2 : ");
        String s2 = sc.nextLine();
        String res = "Anagram";
        s2 = s2.toUpperCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(s1.length()!=s2.length()){
            res = "Not Anagram";
        }
        else{
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i]!=ch2[i]) {
                    res = "Not Anagram";
                }
            }
        }
        System.out.print("The result is "+ res);
        sc.close();
    }
}
