package Day15;
import java.util.*;

public class AddEvenElementsInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        while (num>0) {
            if (num%2==0) {
                sum += (num%10);
            }
            num = num/10;
        }
        System.out.println(sum);

        // while (num>=10) {
        //     num = num/10;
        // }
        // if (num%2==0) {
        //     System.out.println("java");
        // }
        // else{
        //     System.out.println("sql");
        // }
        // System.out.println(num);
    }
}
