package Day4;

public class star {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
