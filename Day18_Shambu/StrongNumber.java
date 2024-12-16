package Day18_Shambu;
import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int check = num;
        // int fact = 1;
        int sum = 0;
        while (num>0) {
            int temp = num%10;
            int fact = 1;
             for (int i = 1; i <= temp; i++) {
                fact = fact*i; 
             }
             sum = sum+fact;
             num = num/10;
        }
        System.out.println(sum);
        if (sum == check) {
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not a Strong Number");
        }
    }
}


// logic is (num == sum of the factorial of the num)