package Special_class5;
import java.util.*;

public class evenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int temp = 0;
        for (int i = 0; i <= a; i++) {
            temp+=i;
        }
        System.out.print("The sum of numbers : "+temp);
    }
}
