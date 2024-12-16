package Day18_Shambu;
import java.util.*;

public class MethodPrimeNumber {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (checkPrime(num)) {
            System.out.println("Prime ");
        }
        else{
         System.out.println("Not Prime");
        }
    }

    public static Boolean checkPrime(int n){
        if (n<0) {
            return false;
        }

        else if (n == 0 || n ==1) {
            return false;
        }

        else {
            for (int i = 2; i <= n; i++) {
                if (n%i==0) {
                    count++;
                }
            }

            if (count>1) {
                return false;
            }
            else{
                return true;
            }

        }

    }
}
