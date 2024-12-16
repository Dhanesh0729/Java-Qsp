package Day9;

public class swapval {
    public static void main(String[] args) {

        //without Temp var

        // int a = 20;
        // int b = 30;
        // a = a+b;
        // b= a-b;
        // a = a-b;
        // System.out.println(a);
        // System.out.println(b);

        //with temp var

        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
