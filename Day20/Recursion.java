package Day20;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Started");
        solve(1);
    }
    public static void solve(int a){
        if (a<=5) {
            System.out.println(a);
            a++;
            solve(a);
        }
    }
}
