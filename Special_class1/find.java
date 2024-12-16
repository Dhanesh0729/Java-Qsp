package Special_class1;
import java.util.*;

public class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int ch = sc.next().charAt(0);
        System.out.println(ch);
        if ((ch>=65 && ch<=97) || (ch>=98 && ch<=122)) {
            System.out.println("it a character");
        }
        else if(ch>=33 && ch<=47){
            System.out.println("it is a special character");
        }
        else {
            System.out.println("it is a number");
        }
    }
}

