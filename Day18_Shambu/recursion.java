package Day18_Shambu;
import java.util.*;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Starting number : ");
        int Start = sc.nextInt();
        System.out.print("Enter a Ending number : ");
        int limit = sc.nextInt();
        recur(Start,limit);
    }

    public static void recur(int start, int end){
        if (start<=end) {
            System.out.println(start);
            start++;
            recur(start, end);
        }
    }
}
