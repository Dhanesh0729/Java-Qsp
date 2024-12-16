package Day25;
import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the matrix : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int left = 0, top = 0, right = cols-1, bottom = rows-1;
        while (left<=right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] +" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;

            for (int i = right; i >= left ; i--) {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
        sc.close();
    }
}
