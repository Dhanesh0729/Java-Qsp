package Day18_Shambu;
import java.util.*;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num  = sc.nextInt();
        int prod = num*num;
        int check = num;
        int sum=0;

        while (prod>0) {
            sum = sum+(prod%10);
            prod /= 10;
        }

        if (sum == check) {
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not a Neon Number");
        }
    }
}
