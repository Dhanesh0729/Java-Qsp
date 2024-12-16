package Special_class1;
import java.util.*;

public class thirdlargenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        int a = sc.nextInt(), b = sc.nextInt(), c= sc.nextInt();

        if (a>b && a>c) {
            System.out.println("A is Greater");
        } else if (b>a && b>c) {
            System.out.println("B is Greater");
        } else{
            System.out.println("C is Greater");
        }
    }
}
