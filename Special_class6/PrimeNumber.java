package Special_class6;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String Result = "Prime";

        if(num==0 || num ==1){
            System.out.println("Neither Prime nor Composite");
        }
        else{
            for (int i = 2; i < num; i++) {
                if (num%i==0) {
                    Result = "Not Prime";
                    break;
                }
            }
        }
        System.out.println(Result);
    }
}