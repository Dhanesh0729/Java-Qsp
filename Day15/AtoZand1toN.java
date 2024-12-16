package Day15;
import java.util.*;

public class AtoZand1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1. 1-N \n2. A-Z \n3. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
    
            switch (choice) {
                case 1:{
                    System.out.print("Enter a number : ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println(i);
                    }
                    break;
                }
                case 2:{
                    char ch = 'A';
                    while (ch<='Z') {
                        System.out.println(ch);
                        ch++;
                    }
                    break;
                }

                case 3:{
                    System.out.println("Tata Bye!!!");
                    check = false;
                    break;
                }
                    
                    
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (check);
    }
}
