package Day26.ParentConstructorSuper;

public class Book {
    Book(){
        System.out.println("No Arguemnt Constructor executed");
    }
    Book(int a){
        System.out.println("Paramterized Constructor executed and the value is "+a);
    }
}
