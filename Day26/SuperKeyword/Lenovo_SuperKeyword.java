package Day26.SuperKeyword;
//Super-2

public class Lenovo_SuperKeyword extends Laptop_SuperKeywordProgram {
    double price = 30000;

    public void details(){
        System.out.println(price);
        System.out.println(super.price);
    }
}
