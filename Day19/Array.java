package Day19;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the "+i+" element : ");
            a[i] = sc.nextInt();
        }
        
        //Print the array elements with the help of Arrays Package
        System.out.println(Arrays.toString(a));

        //Print the array elements with for loop
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
