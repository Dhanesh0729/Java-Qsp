package Special_class1;
import java.util.Scanner;

public class secondlargenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        int a = sc.nextInt(), b = sc.nextInt(), c= sc.nextInt();

        if ((a>b && a<c) || (a<b && a>c)) {
            System.out.println("A is the second largest");
        } else if ((b>a && b<c) || (b<a && b>c)) {
            System.out.println("B is the seccond largest");
        } else{
            System.out.println("C is the second largest");
        }
    }
}
