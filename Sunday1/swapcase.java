package Sunday1;

public class swapcase {
    public static void main(String[] args) {
        String s = "aBcDe";
        char [] ch = s.toCharArray();
        String res = "";
        for (int i = 0; i <s.length(); i++) {
            if (ch[i]>='A' && ch[i]<='Z') {
                res+=(char)(ch[i]+32);
            }
            else if(ch[i]>='a' && ch[i]<='z'){
                res+=(char)(ch[i]-32);
            }
        }
        System.out.println(res);
    }
}
