package Day23;
import java.util.*;

public class ReverseTheRowArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Size:");
        int rowSize = sc.nextInt();
        System.out.println("Enter the Column Size:");
        int colSize = sc.nextInt();

        int[][] mulArr = new int[rowSize][colSize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                mulArr[i][j] = sc.nextInt();
            }
        }

        int[][] temp = new int[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = colSize - 1, k = 0; j >= 0; j--, k++) {
                temp[i][k] = mulArr[i][j];
            }
        }

        System.out.println("Reversed rows of the array:");
        for (int i = 0; i < temp.length; i++) {
            System.out.println(Arrays.toString(temp[i]));
        }

        sc.close();
    }
}
