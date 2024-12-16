package Day18_Shambu;
import java.util.*;
public class meth {
    public static void main(String[] args) {//Calling method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.println("The sum of the numbers are : "+ value(a, b));//method calling statement

        //Doubt??????
        sc.nextLine();

        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        System.out.println("The String you've entered is "+str(s));
    }

    //method to sum two numbers
    public static int value(int num1,int num2){//parameterized called method
        int sum = num1+num2;
        return sum;
    }

    //method to display a String
    public static String str(String dummy){//parameterized called method
        System.out.println("Method Activated");
        return dummy;
    }
}
