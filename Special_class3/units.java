package Special_class3;
import java.util.*;

public class units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.print("Enter the units : ");
        int units = sc.nextInt();

        if(units<=50){
            total = units*0.5;
        }
        else if(units>50 && units<=100){
            total = units*0.75;
        }
        else if(units>100 && units<=200){
            total = units*1;
        }
        else if(units>200 && units<=250){
            total = units*1.25;
        }
        else if(units>250){
            total = units*1.5;
        }
        System.out.println("Total Amount : "+total);
    }
}
