package Day20;
import java.util.*;

public class nthLargestAndnthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int[] res = {2,4,6,8,10};
        System.out.println("The result is "+nthLargest(res, num));
        System.out.println("The result is "+nthSmallest(res, num));
    }
    
    // public static int nthLargest(int[] resultedArray, int n){
    //     int largest = 0;
    //     for (int i = 0; i < n; i++) {
    //         largest = resultedArray[0];
    //         for (int j = 0; j < resultedArray.length; j++) {
    //             if (resultedArray[j]>largest) {
    //                 largest = resultedArray[j];
    //             }
    //         }

    //         for (int j = 0; j < resultedArray.length; j++) {
    //             if (resultedArray[j] == largest) {
    //                 resultedArray[j] = Integer.MIN_VALUE;
    //             }
    //         }
    //     }
    //     return largest;
    // }

    public static int nthLargest(int[] resultedArray, int n){
        int largest = 0;
        int[] temp = resultedArray;
        for (int i = 0; i < n; i++) {
            largest = temp[0];
            for (int j = 0; j < temp.length; j++) {
                if (temp[j]>largest) {
                    largest = temp[j];
                }
            }

            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == largest) {
                    temp[j] = Integer.MIN_VALUE;
                }
            }
        }
        return largest;
    }
    public static int nthSmallest(int[] resultedArray, int n){
        int smallest = 0;
        int[] temp1 = resultedArray;
        for (int i = 0; i <= n; i++) {
            smallest = temp1[0];
            for (int j = 0; j < temp1.length; j++) {
                if (temp1[j]<smallest) {
                    smallest = temp1[j];
                }
            }

            for (int j = 0; j < temp1.length; j++) {
                if (temp1[j] == smallest) {
                    temp1[j] = Integer.MAX_VALUE;
                    
                }
            }
        }
        return smallest;
    }
    // public static int nthSmallest(int[] resultedArray, int n){
    //     int smallest = 0;
    //     for (int i = 0; i <= n; i++) {
    //         smallest = resultedArray[resultedArray.length-1];
    //         for (int j = 0; j > resultedArray.length; j++) {
    //             if (resultedArray[j]>smallest) {
    //                 smallest = resultedArray[j];
    //             }
    //         }

    //         for (int j = 0; j > resultedArray.length; j++) {
    //             if (resultedArray[j] == smallest) {
    //                 resultedArray[j] = Integer.MAX_VALUE;
    //             }
    //         }
    //     }
    //     return smallest;
    // }
}
