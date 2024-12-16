package Special_class1;
import java.util.*;

public class vowelOrconsenant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = Character.toLowerCase(a);
        Boolean isvowel = false;
        char[] arr = {'a','e','i','o','u'};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                isvowel = true;
            }
        }
        if (isvowel) {
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
