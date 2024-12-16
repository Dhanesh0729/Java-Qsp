package Day18_Shambu;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while (num<0) {
            int temp = num%10;
            sum += (temp*temp*temp);
            num = num/10;
        }
        System.out.println(sum);
    }
}
