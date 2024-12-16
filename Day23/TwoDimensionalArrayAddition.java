package Day23;
import java.util.*;

public class TwoDimensionalArrayAddition {
    static Scanner sc = new Scanner(System.in);
    static int rowSize;
    static int colSize;
    public static void main(String[] args) {

        System.out.print("Enter Row Size : ");
        rowSize = sc.nextInt();
        System.out.print("Enter Column Size : ");
        colSize = sc.nextInt();
        int[][] mulArr1 = new int[rowSize][colSize];
        addElementsInArray(mulArr1);
        System.out.println("Second Array ");
        int[][] mulArr2 = new int[rowSize][colSize];
        addElementsInArray(mulArr2);
        TwoDArraySum(mulArr1,mulArr2);
    }

    public static void addElementsInArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static void TwoDArraySum(int[][]a, int[][]b) {
        int[][] sum = new int[rowSize][colSize];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The result of the Sum the 2D Array is ");
        for (int i = 0; i < sum.length; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }
    } 

}
