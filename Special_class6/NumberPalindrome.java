package Special_class6;
import java.util.*;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // System.out.print("enter a word : ");
        // String s = sc.next();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0, check = num;

        while (num>0) {
            rev=rev*10+(num%10);
            num=num/10; 
        }
        System.out.println(rev);
        if (check==rev) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
