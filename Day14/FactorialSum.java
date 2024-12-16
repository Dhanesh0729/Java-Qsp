package Day14;
import java.util.*;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int start = sc.nextInt();
        System.out.print("Enter the end number : ");
        int end = sc.nextInt();
        int temp = 1;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            temp = temp*i;
            sum = sum + temp;
        }
        System.out.println(temp);
        System.out.println(sum);
    }
}
