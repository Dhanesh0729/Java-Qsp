package Special_class6;
import java.util.*;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = sc.nextInt();
        int sum = 0, x = 1;

        while (number>0) {
            sum = sum + (number%2)*x;
            number = number/2;
            x = x*10;
        }
        System.out.println(sum);

    }
}


//logic

// %2*x
// /2
// x*10
