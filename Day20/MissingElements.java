package Day20;

public class MissingElements {
    public static void main(String[] args) {
        int[] a = {1,4,5,6,9};
        MissingElements(a);
    }
    public static void MissingElements(int[] num){
        int j = 1;
        for (int i = 0; i < num.length; i++,j++) {
            if (num[i]!=j) {
                System.out.print(j+" ");
                i--;
            }
        }
    }
}
