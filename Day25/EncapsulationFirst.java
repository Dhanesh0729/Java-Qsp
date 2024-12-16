package Day25;
import java.util.*;

public class EncapsulationFirst {
    private String name;
    private int val;

    public EncapsulationFirst(){
        //LI
    }
    public EncapsulationFirst(String name, int val){
        this.name = name;
        this.val = val;
        System.out.println("The User "+name+" has a balance of "+val);
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val){
        if (val>0) {
            this.val = val;
        }
        else {
            System.out.println("Please enter a valid age");
        }
    }

    public static void main(String[] args) {

    }
}
