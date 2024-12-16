package Day15;
import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter a number : ");
        int num = sc.nextInt();
        String res = "Not a Happy Number";

        while (num !=1 && num !=4) {
            int sum = 0;
            while (num>0) {
                int digit = num%10;
                sum = sum + (digit * digit);
                num = num/10;
            }
            num = sum;
        }

        if (num==1) {
            res = "Happy Number";
        }

        System.out.print("The Resultant number is a "+res);
    }
}
