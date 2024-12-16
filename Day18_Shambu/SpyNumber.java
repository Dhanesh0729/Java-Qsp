package Day18_Shambu;
import java.util.*;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while (num>0) {
            sum += (num%10);
            prod *= (num%10);
            num /= 10;
        }
        System.out.println("The resulted number is "+check(sum, prod));
    }
    public static String check(int sum,int prod){
        if (sum == prod) {
            return "Spy Number";
        }
        else {
            return "Not a Spy Number";
        }
    }
}
