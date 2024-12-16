package Day17;
import java.util.*;

public class XylemOrPhloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num<=99) {
            System.out.println("Invalid Number");
            return;
        }

        int last_num = num%10;
        num = num/10;
        int sum = 0;

        while (num>=10) {
            int mod = num%10;
            sum = sum+mod;
            num = num/10;
        }
        System.out.println("The first number is "+num);
        System.out.println("sum of the middle number is "+sum);
        System.out.println("The last number is "+last_num);

        if ((num+last_num)==sum) {
            System.out.println("Xylem");
        }
        else{
            System.out.println("Phloem");
        }
        // num = num/10;
        // int last_num = num%10;
        // int sum = 0;

        // while (num>=10) {
        //     int mod = num%10;
        //     sum = sum+mod;
        //     num = num/10;
        // }
        // System.out.println(last_num);
        // System.out.println(num);
        // System.out.println(sum);
    }
}
