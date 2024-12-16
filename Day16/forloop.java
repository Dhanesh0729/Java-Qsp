package Day16;
import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //From 1 to n numbers

        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // for (int i = 1; i <= num; i++) {
        //     System.out.println("Java");   
        // }

        //Displays from A to Z range of letters

        // System.out.print("Enter a the first letter : ");
        // char start = sc.next().charAt(0);
        // System.out.print("Enter a the Second letter : ");
        // char end = sc.next().charAt(0);

        //from start to end numbers

        // for (char i = start; i <= end; i++) {
        //     System.out.println(i);
        // }

        //from end to start (i.e) Print the range of numbers in reverse order

        // System.out.print("Enter the starting number : ");
        // int start = sc.nextInt();
        // System.out.print("Enter the Ending number : ");
        // int end = sc.nextInt();
        // for (int i = start; i >= end; i--) {
        //     System.out.println(i);
        // }

        //Displays the range of numbers and if even print java along 
        //with the number and if odd Sum the odd numbers and give the result.

        System.out.print("Enter the starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending number : ");
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i%2==0) {
                System.out.println(i+" - Java");
                // continue;
            }
            else if (i%2==1) {
                sum = sum +i;
                System.out.println(i);
            }
            // System.out.println(i);
        }
        System.out.print("The sum of the odd numbers is "+sum);

    }
}
