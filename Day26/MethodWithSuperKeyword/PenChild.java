package Day26.MethodWithSuperKeyword;

public class PenChild extends Pen{
    public void samediffM1(){
        System.out.println("Im Not different");
    }

    public void m1(){
        diffM1();
        samediffM1();
    }
}
