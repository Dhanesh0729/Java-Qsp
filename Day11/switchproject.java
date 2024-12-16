package Day11;
/**
 * switchproject
 */
import java.util.*;
public class switchproject {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Skill you wanna get mastered :) \n 1. SQL \n 2. Java");
        int a = sc.nextInt();

        switch (a) {
            case 1:{
                System.out.println("Hey! Thanks for choosing SQL");
                Thread.sleep(500);
                System.out.println("Kindly Choose the SQL Faculty \n 1.Nagaraj \n 2.Neeraj \n 3.Barath");
                int b = sc.nextInt();
                switch (b) {
                    case 1:{
                        System.out.println("Thanks for choosing Nagaraj as your Faculty!, GET LOST!!!");
                        break;}
                    case 2:{
                        System.out.println("Thanks For Choosing Neeraj as your faculty!");
                        break;
                    }
                    case 3:{
                        System.out.println("Thanks For Choosing Barath as your faculty!");
                        break;
                    }
                    default:
                    System.out.println("Enter a Valid Choice");
                        break;
                }
                break;
            }
                
            case 2:{
                System.out.println("Hey! Thanks for choosing Java");
                Thread.sleep(500);
                System.out.println("Kindly Choose the Java Faculty \n 1.Syed Tabrez \n 2.Shambu \n 3.Nandhini");
                int b = sc.nextInt();
                switch (b) {
                    case 1:{
                        System.out.println("Thanks for choosing Syed Tabrez as your Faculty!, Enjoy the free Music Concert with his class");
                        break;
                    }
                    case 2:{
                        System.out.println("Thanks For Choosing Shambu as your faculty!");
                        break;
                    }
                    case 3:{
                        System.out.println("Thanks For Choosing Nandhini as your faculty!");
                        break;
                    }
                    default:
                        System.out.println("Enter a Valid Choice");
                        break;
                }
                break;
            }
            default:{
            System.out.println("Enter a Valid Choice");
            break;}
        }
    }   
}