package Day21_DSA;
import java.util.*;

public class FirstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int temp = 0;
        while (num>=10) {
            temp = num/10;
            num = num/10;
        }
        System.out.println(temp);
    }
}
