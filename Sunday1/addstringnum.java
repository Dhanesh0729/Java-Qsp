package Sunday1;

public class addstringnum {

    public static void main(String[] args) {
        String s = "AB18C3D";
        char [] c = s.toCharArray();
        int add = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i]>='0' && c[i]<='9') {     
                add+=c[i]-48;
            }
        }
        System.out.println(add);
    }
}