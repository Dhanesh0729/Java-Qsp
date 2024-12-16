package Day23;
import java.util.*;

public class FindLargestInA2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Row : ");
        int rowSize = sc.nextInt();
        System.out.print("Enter the size of the Column : ");
        int colSize = sc.nextInt();

        int[][] arr = new int[rowSize][colSize];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }
}