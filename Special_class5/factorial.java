package Special_class5;
import java.util.*;

//wrong  

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int start = sc.nextInt();
        System.out.print("Enter the end number : ");
        int end = sc.nextInt();
        int temp = 1;

        // for (int i = start; i <= end; i++) {       
        //     for (int j = 1; j <= end; j++) {
        //         temp = temp*j;
        //     }
        //     System.out.println(i+" - "+ temp);
        // }

        for (int i = 1; i <= end; i++) {
            temp = temp*i;
        }
        System.out.println(temp);

    }
}
