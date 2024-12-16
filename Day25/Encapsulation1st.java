package Day25;
import java.util.*;

public class Encapsulation1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String s1 = sc.nextLine();
        System.out.print("Enter a Integer Value : ");
        int i1 = sc.nextInt();
        EncapsulationFirst E1 = new EncapsulationFirst(s1,i1);

        System.out.println("Name : "+ E1.getName());
        System.out.println("Value : "+ E1.getVal());

        E1.setName("Value Changed");
        E1.setVal(100);

        System.out.println("Name : "+ E1.getName());
        System.out.println("Value : "+ E1.getVal());
    }
}
