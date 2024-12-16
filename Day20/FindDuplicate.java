package Day20;
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        CountDup(arr);
        sc.close();
    }
    // public static void CountDup(int[] a){
    //     int count;
    //     for (int i = 0; i < a.length; i++) {
    //         count = 0;
    //         for (int j = 0; j < a.length; j++) {
    //             if (a[i]==a[j]) {
    //                 count++;
    //             }
    //         }
    //         System.out.println("The value "+a[i]+" is in the array "+count+" times");
    //     }
    // }

    public static void CountDup(int[] a) {
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println("The value " + a[i] + " is in the array " + count + " times");
            }
        }
    }
}
