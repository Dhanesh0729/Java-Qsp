package Day14;
import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Game");
        int Rand_num = (int)(Math.random()*100);
        int User_num;
        Boolean val = true;

        do {
            System.out.print("Enter a number : ");
            User_num = sc.nextInt();

            if (User_num<Rand_num) {
                System.out.println("Entered Number is less");
            }
            else if (User_num>Rand_num) {
                System.out.println("Entered Number is high");
            }
            else {
                System.out.println("You found the number!!!");
                val = false;
                Thread.sleep(2000);
                System.out.println("You wanna play again?\n 1. Yes \n 2. No");
                System.out.println("Enter Your choice");
                int choice = sc.nextInt();
                if (choice == 1) {
                    val = true;
                    Rand_num = (int)(Math.random()*100);
                }
                else if (choice == 2){
                    System.out.println("Will see you again");
                }
            }
        } while (val);
    }
}