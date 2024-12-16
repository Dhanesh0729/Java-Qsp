package Day21_DSA;
import java.util.*;

public class ArrayFirstDigitOnlySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        SumFirstDigit(arr);
        sc.close();
    }
    public static void SumFirstDigit(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=10) {
                while (a[i]>9) {
                    a[i] = a[i]/10;
                }
                sum=sum+a[i];
            }
        }
        System.out.println("The resulted First Element value is "+sum);
    }
}
