package Day18_Shambu;
import java.util.*;
public class OddFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("The Result of Odd factorial of the given Number is : "+Oddfact(num));
    }
    public static int Oddfact(int n){
        int oddProd = 1;
        for (int i = 0; i <= n; i++) {
            int fact = 1;
            if (i%2==1) {
                fact = fact*i;
            }
            oddProd *= fact;
        }
        return oddProd;
    }
}
