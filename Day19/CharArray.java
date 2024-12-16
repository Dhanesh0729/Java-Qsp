package Day19;
import java.util.*;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        char[] arr = new char[size];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Enter the letter : ");
            arr[i] = sc.next().charAt(0);
        }
        
        for (int i = 0; i < arr.length; i++) {
            // char letter = arr[i].charAt(0);
            System.out.println(arr[i]+" -- "+(int)arr[i]);
        }

        // System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
