package Day19;
import java.util.*;

public class PassByReference {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        // Studpercent(arr);
        Studpercentrev(arr);

    }
    // public static void Studpercent(double[] a){
    //     for (int i = 0; i < a.length ; i++) {
    //         System.out.print("Enter the number ");
    //         a[i] = sc.nextDouble();
    //     }
    //     System.out.println(Arrays.toString(a));
    // }

    public static void Studpercentrev(double[] a){
        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print("Enter the "+ i +" number : ");
            a[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(a));
    }
}
