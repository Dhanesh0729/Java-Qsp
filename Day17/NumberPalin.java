package Day17;
import java.util.*;

public class NumberPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int check = num;
        int reverse = 0;

        while (num>0) {
            reverse = reverse*10+(num%10);
            num/=10;
        }
        
        if (check==reverse) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
