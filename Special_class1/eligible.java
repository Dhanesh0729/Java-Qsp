package Special_class1;
import java.util.*;

public class eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a%4==0 && a%6==0) {
            System.out.println("Your Name");
        }
        else{
            System.out.println("Nothing");
        }
    }
}
