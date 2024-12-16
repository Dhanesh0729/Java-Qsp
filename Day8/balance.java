package Day8;
import java.util.*;

public class balance {
    //Dinga Balance

    // public static void main(String[] args) {
    //     double wallet = 2500.0;
    //     double tshirt = 1200.0;
    //     wallet = wallet-tshirt;
    //     System.out.println("Dinga has "+wallet);
    //     System.out.println("remaining of amount in dinga wallet is "+ wallet);
    // }

    // public static void main(String[] args) {
    //     double kiran_wallet = 8000;
    //     int biriyani_quantity = 4;
    //     double price = 120;
    //     price = price * biriyani_quantity;
    //     System.out.println("Kiran has "+kiran_wallet);
    //     kiran_wallet = kiran_wallet-price;
    //     System.out.println("After buying Biriyani, Kiran has"+ kiran_wallet);
    // }

    // public static void main(String[] args) {
    //     Scanner val = new Scanner(System.in);
    //     int a;
    //     System.out.println("enter a value");
    //     a = val.nextInt();
    //     System.out.println("user entered "+a/10);
    //     System.out.println("user entered "+a/100);
    // }

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        int a = val.nextInt();
        System.out.println("enter a value");
        System.out.println("user entered "+a%10);
        System.out.println("user entered "+a%100);
    }
}
