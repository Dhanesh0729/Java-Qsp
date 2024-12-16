package Day13;
import java.util.*;

public class WhileOneTo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start Number : ");
        int start = sc.nextInt();
        System.out.print("Enter a End Number : ");
        int end = sc.nextInt();

        //prints a range of numbers
        // while (start<=end) {
        //     System.out.println(start);
        //     start++;
        // }

        //prints the range of numbers which is divisible by 5
        // while (start<=end) {
        //     if (start%5==0) {
        //         System.out.println(start);
        //     }
        //     start++;
        // }

        // prints the range of numbers which is divisible by 2 and 6
        // while (start<=end) {
        //     if (start%2==0 && start%6==0) {
        //         System.out.println(start);
        //     }
        //     start++;
        // }

        //prints the range of numbers from n to 1
        // while (1<=end) {
        //         System.out.println(end);
        //     end--;
        // }

        //prints the range of Even numbers 
        // while (start<=end) {
        //     if (start%2==0) {
        //         System.out.println(start);
        //     }
        //     start++;
        // }

        //prints the range of  numbers 
        while (start<=end) {
            if (start%2==1) {
                System.out.println(start);
            }
            start++;
        }
    }
}
