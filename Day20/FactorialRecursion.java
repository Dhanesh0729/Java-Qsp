package Day20;
import java.util.*;

public class FactorialRecursion {
    static int fact = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("The Factorial of "+num+" is "+FactRec(num));
        sc.close();
    }
    public static int FactRec(int a) {
        if (a>=2) {
            fact = fact*a;
            a--;
            FactRec(a);
        }
        return fact;
    }
}
