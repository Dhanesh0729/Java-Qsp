package Special_class5;
import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a  = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b  = sc.nextInt();
        int gcd = 1;
        

        for (int i = 1; i <= a && i <= b; i++) {
            if (a%i==0 && b%i==0) { 
                gcd = i;
            }            
        }
        System.out.println(gcd);
    }
}
