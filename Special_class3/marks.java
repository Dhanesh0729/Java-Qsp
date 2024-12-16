package Special_class3;
import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics marks:");
        int Physics = sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Maths marks:");
        int Maths = sc.nextInt();
        System.out.println("Enter Tamil marks:");
        int Tamil = sc.nextInt();
        System.out.println("Enter English marks:");
        int English = sc.nextInt();
        System.out.println("Enter CS marks:");
        int CS = sc.nextInt();

        int Total = Physics + Chemistry + Maths + Tamil + English + CS;
        double Percentage = Total / 6.0;

        if (Percentage > 90) {
            System.out.println("O grade");
        } else if (Percentage > 80) {
            System.out.println("A+ Grade");
        } else if (Percentage > 70) {
            System.out.println("A Grade");
        } else if (Percentage > 60) {
            System.out.println("B+ Grade");
        } else if (Percentage > 50) {
            System.out.println("B Grade");
        } else {
            System.out.println("Failed");
        }

        sc.close();
    }
}
