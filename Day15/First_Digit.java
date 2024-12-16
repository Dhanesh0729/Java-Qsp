package Day15;
import java.util.*;

public class First_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        while (number>10) {
            number = number/10;
        }
        if (number%2==0) {
            System.out.println("Even "+number);
        }
        else {
            System.out.println("Odd "+number);
        }
    }
}
