package Special_class4;
import java.util.*;

public class while1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter an ending value : ");
        int end = sc.nextInt();

        while (a<=end) {
            if (a%2==1) {
                System.out.println(a);
            }
            a++;
        }
    }
}
