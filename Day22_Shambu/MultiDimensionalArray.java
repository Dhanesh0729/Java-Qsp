package Day22_Shambu;
import java.util.*;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Size");
        int rowSize = sc.nextInt();
        System.out.println("Enter the Column Size");
        int colSize = sc.nextInt();

        int[][] mulArr = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                mulArr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mulArr.length; i++) {
            System.out.println(Arrays.toString(mulArr[i]));
        }
    }
}
