package Day14;
import java.util.*;

public class PerfectSquare {
    // static int i;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        Boolean Result = false;

        //Logic 1

        for (int i = 1; i <= n; i++) {
            if (n == i*i) {
                Result = true;
                break;
            }
            else {
                Result = false;
            }
        }

        if (Result) {
            System.out.println("Perfect");
            System.out.print("The sum of the Perfect Square Number is "+sumofperfectsquare(n));
        }
        else{
            System.out.println("Not Perfect");
            System.out.print("The Product of the Non Perfect Square number is "+ProductofNotPerfectSquare(n));
        }

                            //(or)

        //Logic 2 requires i to be declared as global variable

        // for (i = 1; i <= n; i++) {
        //     if (n == (int)Math.pow(i, 2)) {
        //         System.out.println("Perfect Square number");
        //         break;
        //     }
        // }
        // if (n != (int)Math.pow(i, 2)) {
        //     System.out.println("Not a Perfect Square");
        // }
    }

    // Methods
    
    public static int sumofperfectsquare(int num){
        int sum = 0;
        while (num!=0) {            
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

    public static int ProductofNotPerfectSquare(int num){
        int prod = 1;
        while (num!=0) {            
            prod *= num%10;
            num /= 10;
        }
        return prod;
    }
    
}