package Day20;
import java.util.*;

public class MoveZeroesToRightOnesToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        ZeroesToRight(arr);
        sc.close();;
    }
    public static void ZeroesToRight(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]==0) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Only Zeroes are moved in right side - "+Arrays.toString(a));
        OnesToLeft(a);
    }
    public static void OnesToLeft(int[] b){
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]==1) {
                int temp = b[i];
                b[i] = b[index];
                b[index] = temp;
                index++;
            }
        }
        System.out.print("Zeroes to the right side and Ones to the left side - "+Arrays.toString(b));
    }
    // public static void OnesToLeft(int[] b){
    //     for (int i = 0; i < b.length; i++) {
    //         for (int j = 0; j < b.length ; j++) {
    //             if (b[j]==1) {
    //                 int temp = b[j];
    //                 b[j] = b[j-1];
    //                 b[j-1] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(b));
    // }
}
