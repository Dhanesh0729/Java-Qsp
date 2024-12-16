package Day15;
import java.util.*;
//a program to print no of zeroes in a given number
public class NoOfZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        while (num>0) {
            if (num%10 == 0) {
                count++;
            }
            num = num/10;
        }
        System.out.println("No of zeroes in the given number is : " + count);     
    }
}
