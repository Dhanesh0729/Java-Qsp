package Special_class4;
import java.util.Scanner;

public class dowhile {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value : ");
        int ch = sc.next().charAt(0);
        int count = 0;
        
        do{
            System.out.println((char)ch);
            ch++;
            count++;
        }while (count<=26);
    }
}

