package Day18_Shambu;
import java.util.*;

public class DuckNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp;
        String res = "not a Duck number";

        while (num>=10) {
            temp = num%10;
            if (temp==0) {
                res = "Duck Number";
            }
            num = num/10;
        }
        // res = "Not a Duck Number ";
        System.out.println(res);
    }
}
