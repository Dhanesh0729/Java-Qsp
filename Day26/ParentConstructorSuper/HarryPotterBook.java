package Day26.ParentConstructorSuper;

public class HarryPotterBook extends Book{
    HarryPotterBook(){
        super(10);
        System.out.println("Hey Im harry Potter");
    }

    public void display(){
        System.out.println("Display method executed");
    }
}
