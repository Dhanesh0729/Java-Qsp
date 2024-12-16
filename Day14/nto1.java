package Day14;
import java.util.*;
public class nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        String res = "Prime";
        int i = 2;

        if (n==0 || n==1) {
            res = "Neither Prime Not Composite Number";
        }

        while (i<n) {
            if (n%i==0) {
                res="Not Prime";
            }
            i++;
        }
        
        System.out.println(res);
    }
}
