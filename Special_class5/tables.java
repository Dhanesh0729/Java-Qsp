package Special_class5;
import java.util.*;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which tables you want : ");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a+" X "+ i + " = " + (i*a));
        }
    }
}
