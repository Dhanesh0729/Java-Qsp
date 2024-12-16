package Special_class5;
import java.util.*;

public class nestedfor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start : ");
        int start = sc.nextInt();
        System.out.println("Enter End : ");
        int end  = sc.nextInt();

        //reverse tables parallely

        // for (int i = 1; i <= 10; i++) {
        //     for (int j = end; j >= start; j--) {
        //         Thread.sleep(50);
        //         System.out.print(j + " X " + i + " = " + (i*j)+ "\t" );
        //     }
        //     System.out.println();
        // }

        //tables parallely 

        // for (int i = 1; i <= 10; i++) {
        //     for (int j = start; j <= end; j++) {
        //         Thread.sleep(50);
        //         System.out.print(j + " X " + i + " = " + (i*j)+ "\t" );
        //     }
        //     System.out.println();
        // }

        //my wrong program

        // for (int i = start; i <= end; i++) {
        //     for (int j = 1; j <= 10; j++) {
        //         Thread.sleep(50);
        //         System.out.println(i + " X " + j + " = " + (i*j)+ "\t" );
        //     }
        //     System.out.print("\t");
        // }

        //star program in rows and columns

        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }   
}
