package Special_class2;
import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a==b && b==c) {
            System.out.println("Equialateral Triangle");
        }
        else if(a==b || b==c || c==a){
            System.out.println("Isocelous Triangle");
        }
        else {
            System.out.println("Scalar Triangle");
        }
    }
}