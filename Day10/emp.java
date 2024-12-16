package Day10;
import java.util.*;
public class emp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Eid:");
        int Eid  = sc.nextInt();
        System.out.println("Enter sal");
        int sal = sc.nextInt();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter Contact number:");
        long contact = sc.nextLong();
        System.out.println("Name of first letter is");
        char name = sc.next().charAt(0);
        System.out.println("Eid is: "+Eid);
        System.out.println("Salary is: "+sal);
        System.out.println("Age is: "+age);
        System.out.println("Contact number is: "+contact);
        System.out.println("first letter of the name is: "+name);
    }
}
