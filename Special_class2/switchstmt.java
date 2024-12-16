package Special_class2;
import java.util.*;

public class switchstmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                // System.out.println("Switch 1");
                break;
            
            case 2:
                System.out.println("Switch 2");
                break;

            case 3:
                System.out.println("Switch 3");
                break;

            default:
            System.out.println("Invalid Switch");
                break;
        }
    }
}
