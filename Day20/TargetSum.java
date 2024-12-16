package Day20;
import java.util.*;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Sum Number : ");
        int num = sc.nextInt();
        targetSumValue(arr, num);
    }
    
    public static void targetSumValue(int[] a,int target){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]+a[j]==target){
                    System.out.println(a[i]+"+"+a[j]);
                }
            }
        }
    }
}
