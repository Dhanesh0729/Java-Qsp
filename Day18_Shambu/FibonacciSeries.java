package Day18_Shambu;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int sum = 0;

        System.out.print(num1+" "+num2);

        for (int i = 1; i <= number-2 ; i++) {
            temp = num1+num2;
            System.out.print(" "+temp);
            num1 = num2;
            num2 = temp;
            sum += temp;
        }
        System.out.println("\nThe Sum of the Fibonacci Series is "+sum);
        sc.close();
    }
}
