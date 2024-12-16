package Sunday1;

public class replacechar {
    public static void main(String[] args) {
        String s= "biriyani";
        char [] ch = s.toCharArray();
        System.out.println(ch);

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='i') {
                ch[i]='a';
            }
        }
        System.out.println(ch);
    }
}
