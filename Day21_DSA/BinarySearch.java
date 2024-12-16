package Day21_DSA;
import java.util.*;

public class BinarySearch {
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
        BinaryAlg(arr,Target);
        sc.close();
    }
    public static void BinaryAlg(int[] a, int Tar){
        int l = 0, h = a.length-1, mid = (l+h)/2;

        while (l<=h) {
            if (Tar == a[mid]) {
                System.out.println("The element "+ a[mid]+" found in index "+ mid);
                break;
            }
            else if (Tar<a[mid]) {
                h = mid-1;
            }
            else if (Tar>a[mid]) {
                l = mid+1;
            }
            mid = (l+h)/2;
        }
    }
}
