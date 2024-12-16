package Day21_DSA;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Target Value : ");
        int Target = sc.nextInt();
        LinearAlg(arr,Target);
        sc.close();
    }


    public static void LinearAlg(int[] a, int tar){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == tar) {
                System.out.println("The Value "+a[i]+" is in the index of "+i);
            }
        }
    }
}
