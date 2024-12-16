package Day20;
import java.util.*;
public class CopyArray_UsingArraysPackage {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        System.out.println("original: "+Arrays.toString(original));
        System.out.print("copy: "+Arrays.toString(copy));
    }
}
